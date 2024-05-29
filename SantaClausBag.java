import java.util.*;
public class SantaClausBag {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            int quantidadeValores = scanner.nextInt();
            scanner.nextLine();
            int[] quantidadeBrinquedos = new int[quantidadeValores];
            int[] peso = new int[quantidadeValores];

            // Ler os valores de entrada
            for (int j = 0; j < quantidadeValores; j++) {
                String entrada = scanner.nextLine();
                String[] partes = entrada.split(" ");
                quantidadeBrinquedos[j] = Integer.parseInt(partes[0]);
                peso[j] = Integer.parseInt(partes[1]);
            }

            // Ordenar os pacotes pela quantidade de brinquedos usando o algoritmo de seleção
            selectionSort(quantidadeBrinquedos, peso);

            // Calcular a quantidade de brinquedos e os pacotes restantes
            int soma = 0;
            int somaCorreta=0;
            int brinquedos = 0;
            int faltam = 0;
            for (int k = 0; k < quantidadeValores; k++) {
                soma += peso[k];

                if (soma <= 50) {
                    somaCorreta+=soma;
                    brinquedos += quantidadeBrinquedos[k];
                } else {
                    faltam++;
                }
            }

            // Imprimir a saída
            System.out.println(brinquedos + " brinquedos");
            System.out.println("Peso: " + somaCorreta + " kg");
            System.out.println("Sobra(m): " + faltam + " pacote(s)\n");
        }

        scanner.close();
    }

    public static void selectionSort(int[] quantidadeBrinquedos, int[] peso) {

        for (int i = 0; i < quantidadeBrinquedos.length - 1; i++) {
            int maxIndex = i; // Altere o nome da variável para maxIndex
            for (int j = i + 1; j < quantidadeBrinquedos.length; j++) {
                if (quantidadeBrinquedos[j] > quantidadeBrinquedos[maxIndex]) { // Altere a condição para verificar se o elemento atual é maior
                    maxIndex = j;
                }
            }
            // Trocar os valores nos vetores
            int temp = quantidadeBrinquedos[maxIndex];
            quantidadeBrinquedos[maxIndex] = quantidadeBrinquedos[i];
            quantidadeBrinquedos[i] = temp;
    
            temp = peso[maxIndex]; // Trocar também os pesos correspondentes
            peso[maxIndex] = peso[i];
            peso[i] = temp;
        }
}
}