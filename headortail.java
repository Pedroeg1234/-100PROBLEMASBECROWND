import java.util.Scanner;

public class headortail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int quantidade = scanner.nextInt();
            if (quantidade == 0) {
                break;
            }

            scanner.nextLine();

            int[] vetorResultados= new int[quantidade];

            for (int j=0;j<quantidade;j++){

                vetorResultados[j]= scanner.nextInt();
            }
      
            int quantidadeMary = 0;
            int quantidadeJohn = 0;
            for (int i = 0; i < vetorResultados.length; i++) {
                if (vetorResultados[i] == 0) {
                    quantidadeMary++;
                } else if (vetorResultados[i] == 1) {
                    quantidadeJohn++;
                }
            }

            System.out.println("Mary won " + quantidadeMary + " times and John won " + quantidadeJohn + " times");
        }
    }
}
