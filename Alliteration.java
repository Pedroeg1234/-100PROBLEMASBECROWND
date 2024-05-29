import java.util.Scanner;

public class Alliteration {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();

        String partes[] = entrada.split(" ");

        int quantidadeDeAliteracoes = 0;
        for (int i = 1; i < partes.length; i++) {

            int contagemAliteracoes = 0;
            char parteAtual = Character.toLowerCase(partes[i].charAt(0));
            char parteAnterior = Character.toLowerCase(partes[i - 1].charAt(0));

            while (parteAtual == parteAnterior) {
                contagemAliteracoes++;
                i++;
                if (i < partes.length) {
                    parteAtual = Character.toLowerCase(partes[i].charAt(0));
                    parteAnterior = Character.toLowerCase(partes[i - 1].charAt(0));
                } else {
                    break;
                }
            }

            if (contagemAliteracoes > 0) {
                quantidadeDeAliteracoes++;
            }
        }

        System.out.println(quantidadeDeAliteracoes);
    }
}
