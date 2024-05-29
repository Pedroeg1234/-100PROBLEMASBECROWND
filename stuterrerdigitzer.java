import java.util.Scanner;

public class stuterrerdigitzer{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();

        String[] partes = texto.split(" ");

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < partes.length; i++) {

            String parteAtual = partes[i];

            if (parteAtual.length() >= 4) {
                char primeiroCaractere = parteAtual.charAt(0);
                char segundoCaracter = parteAtual.charAt(1);

                if (parteAtual.charAt(2) == primeiroCaractere && parteAtual.charAt(3) == segundoCaracter) {
                    str.append(parteAtual.substring(2));
                } else {
                    str.append(parteAtual);
                }
            } else {
                str.append(parteAtual);
            }

            if (i < partes.length - 1) {
                str.append(" ");
            }
        }

        System.out.println(str);
    }
}
