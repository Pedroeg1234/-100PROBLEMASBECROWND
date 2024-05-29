import java.util.Scanner;

public class evenandodd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int pares[] = new int[n];
        int contPar = 0;
        int impares[] = new int[n];
        int contImpar = 0;

        for (int i = 0; i < n; i++) {
            int numAtual = scanner.nextInt();
            if (numAtual % 2 == 0) {
                pares[contPar++] = numAtual;
            } else {
                impares[contImpar++] = numAtual;
            }
        }

        Ordenar(pares, contPar);
        Ordenar(impares, contImpar);

        int vetorFinal[] = new int[n];
        int contVetor = 0;

        for (int i = 0; i < contPar; i++) {
            vetorFinal[contVetor++] = pares[i];
        }

        for (int i = 0; i < contImpar; i++) {
            vetorFinal[contVetor++] = impares[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(vetorFinal[i] + " ");
        }
    }

    public static void Ordenar(int vet[], int tam) {
        for (int i = 0; i < tam - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < tam; j++) {
                if (vet[j] >
                 vet[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = vet[indiceMenor];
            vet[indiceMenor] = vet[i];
            vet[i] = temp;
        }
    }
}
