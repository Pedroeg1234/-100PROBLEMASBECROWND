import java.util.Scanner;

public class barbecueatYuri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0)
                break; // Encerra o loop se n for igual a 0
            scanner.nextLine(); // Consumir a nova linha pendente após ler o valor de n

            String carne[] = new String[n];
            int quantidade[] = new int[n];

            for (int i = 0; i < n; i++) {

                String alimentos = scanner.nextLine();

                String partes[] = alimentos.split(" ");

                carne[i] = partes[0];
                quantidade[i] = Integer.parseInt(partes[1]);
            }

            // Ordena as peças de carne pelo nome
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (carne[j].compareTo(carne[minIndex]) < 0) {
                        minIndex = j;
                    }
                }
                // Troca o elemento mínimo encontrado com o primeiro elemento
                String tempCarne = carne[minIndex];
                carne[minIndex] = carne[i];
                carne[i] = tempCarne;

                int tempQuantidade = quantidade[minIndex];
                quantidade[minIndex] = quantidade[i];
                quantidade[i] = tempQuantidade;
            }

            // Imprime as peças de carne ordenadas pelo nome
            for (int i = 0; i < n; i++) {
                System.out.println(carne[i]);
            }
        }
    }
}
