import java.util.Random;
import java.util.Scanner;

public class alteracaoAleatoria {

    public static void main(String[] args) {

        Scanner scanner= new Scanner (System.in);
       
        Random gerador = new Random();
        gerador.setSeed(4);

        while (true){
            
            char letraAleatoria = ((char)('a' + (Math.abs(gerador.nextInt()) % 26)));
            char trocaAleatoria = ((char)('a' + (Math.abs(gerador.nextInt()) % 26)));

            String frase = scanner.nextLine();

            if (frase.equals("FIM")){
                break;
            }

            StringBuilder str = new StringBuilder();

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == letraAleatoria) {
                    str.append(trocaAleatoria);
                } else {
                    str.append(frase.charAt(i));
                }
            }

            System.out.println (str);
        }

        scanner.close();
    }
}
