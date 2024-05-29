import java.util.Scanner;

public class contractrevision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numeroPraRemover = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número

            if (numeroPraRemover == 0) {
                break;
            }

            String entradaNumeros = scanner.nextLine();
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < entradaNumeros.length(); i++) {
                if (entradaNumeros.charAt(i) != (char) (numeroPraRemover + '0')) {
                    str.append(entradaNumeros.charAt(i));
                }
            }

            int strPraInteiro;
            if (str.length() == 0) {
                strPraInteiro = 0;
            } else {
                strPraInteiro = Integer.parseInt(str.toString());
            }
            System.out.println(strPraInteiro);
        }
    }
}
