import java.util.Scanner;

public class ObiUri {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String palavras[] = {"obi", "uri"};

        String entrada = scanner.nextLine();

        String partes[] = entrada.split(" ");

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < partes.length; i++) {

            String parteAtual = partes[i];
            boolean encontrouCorrespondencia = false;

            for (int j = 0; j < palavras.length; j++) {

                String palavraAtual = palavras[j];

                // Verifica se a parte atual e a palavra atual têm o mesmo tamanho
                if (parteAtual.length() == palavraAtual.length()) {

                    int iguais = 0;

                    // Compara as letras das partes e palavras
                    for (int k = 0; k < palavraAtual.length(); k++) {
                        if (parteAtual.charAt(k) == palavraAtual.charAt(k)) {
                            iguais++;
                        }
                    }

                    // Se duas letras forem iguais, substitui a parte pela palavra
                    if (iguais == 2) {
                        str.append(palavraAtual).append(" ");
                        encontrouCorrespondencia = true;
                        break;
                    }
                }
            }

            // Se não encontrou correspondência, mantém a parte atual
            if (!encontrouCorrespondencia) {
                str.append(parteAtual).append(" ");
            }
        }

        System.out.println(str.toString().trim());
    }
}
