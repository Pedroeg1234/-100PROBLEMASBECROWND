import java.util.Scanner;

public class badvibeswalk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String[][] matrix = new String[N][M];

        // Ler a matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.next();
            }
        }

        // Ordenar a matriz usando Selection Sort
        for (int i = 0; i < N * M; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N * M; j++) {
                if (compare(matrix[j / M][j % M], matrix[minIndex / M][minIndex % M]) < 0) {
                    minIndex = j;
                }
            }
            // Trocar elementos
            String temp = matrix[i / M][i % M];
            matrix[i / M][i % M] = matrix[minIndex / M][minIndex % M];
            matrix[minIndex / M][minIndex % M] = temp;
        }

        // Imprimir a matriz ordenada
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    // Função para comparar dois elementos da matriz
    private static int compare(String s1, String s2) {
        int crit1 = Integer.parseInt(s1.substring(0, s1.length() - 1));
        char type1 = s1.charAt(s1.length() - 1);
        int crit2 = Integer.parseInt(s2.substring(0, s2.length() - 1));
        char type2 = s2.charAt(s2.length() - 1);

        // Ordenar primeiro por tipo (Vida ou Disciplina)
        if (type1 != type2) {
            return type1 == 'V' ? -1 : 1;
        }
        // Se os tipos forem iguais, ordenar por criticidade
        return Integer.compare(crit2, crit1);
    }
}
