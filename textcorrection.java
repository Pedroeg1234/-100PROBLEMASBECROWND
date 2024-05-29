import java.util.Scanner;

public class textcorrection {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String frase = scanner.nextLine();
            int tam = frase.length();
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < tam; i++) {
                char caractereAtual = frase.charAt(i);
                if (frase.charAt(i) == ' ' && i + 1 < tam && (frase.charAt(i + 1) == '.' || frase.charAt(i + 1) == ',')) {
                    str.append(frase.charAt(i + 1)); // Adiciona a vírgula ou ponto
                    i++; // Pula o caractere de pontuação
                } else {
                    str.append(caractereAtual);
                }
            }

            System.out.println(str);
        }
    }
}
