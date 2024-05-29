import java.util.Scanner;

public class databaseofclients {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] entradas = new String[n];
        for (int i = 0; i < n; i++) {
            entradas[i] = scanner.nextLine();
        }

        String[] frases = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            String fraseAtual = entradas[i];

            for (int j = 0; j < fraseAtual.length(); j++) {
                char caractereAtual = fraseAtual.charAt(j);

                if (caractereAtual == '.') {
                    // Ignora o ponto, não adiciona ao StringBuilder
                } else if (caractereAtual == '+') {
                    // Ignora todos os caracteres até o '@'
                    while (j < fraseAtual.length() && fraseAtual.charAt(j) != '@') {
                        j++;

                        if (fraseAtual.charAt(j) == '@'){

                            str.append('@');
                        }
                    }
                    // Não adiciona o '@' ao StringBuilder
                } else {
                    // Adiciona outros caracteres normalmente
                    str.append(caractereAtual);
                }
            }

            frases[i] = str.toString();
        }

        int quantidadeUnico = 0;

        for (int k = 0; k < frases.length; k++) {
            boolean unico = true;
            String fraseAtual = frases[k];

            System.out.println (fraseAtual);
            for (int l = k + 1; l < frases.length; l++) {
                if (fraseAtual.equals(frases[l])) {
                    unico = false;
                    break; // Não é necessário continuar verificando se já encontramos uma correspondência
                }
            }

            if (unico) {
                quantidadeUnico++;
            }
        }

        System.out.println(quantidadeUnico);
    }
}
