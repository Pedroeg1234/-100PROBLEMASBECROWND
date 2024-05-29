import java.util.Scanner;

public class goingtothemarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int quantidadeEntradas = scanner.nextInt();
            scanner.nextLine();
          

            String[] alimentos = new String[100];
            Double[] valoresAlimentos = new Double[100];
            int contAlimentos = 0;
            int contValores = 0;

            for (int j = 0; j < quantidadeEntradas; j++) {

                String entrada = scanner.nextLine(); // Usar scanner.next() ao invés de scanner.nextLine()

                String[] partes = entrada.split(" ");

                alimentos[contAlimentos++] = partes[0];
                valoresAlimentos[contValores++] = Double.parseDouble(partes[1]);
            }

            double valorFinal = 0;

            int quantidadeSaidas = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente
            for (int j = 0; j < quantidadeSaidas; j++) {

                String ent = scanner.nextLine(); // Consumir a nova linha pendente

                String[] partes = ent.split(" ");

                String produtoDesejado = partes[0];
                double quantidadeDesejada = Double.parseDouble(partes[1]); // Converter para double

                for (int k = 0; k < contAlimentos; k++) {

                    if ( alimentos[k].equals(produtoDesejado)) {

                        valorFinal += (valoresAlimentos[k] * quantidadeDesejada);
                    }
                }
            }
            System.out.printf("R$ %.2f\n", valorFinal);
        }
    }
}
