import java.util.Scanner;

public class kiloman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int quantidade = scanner.nextInt();
            scanner.nextLine(); 

            String alturas = scanner.nextLine();
            String[] Alturapartes = alturas.split(" ");

            String ParadoSaltando = scanner.nextLine();
            char[] paradoSaltandoArray = ParadoSaltando.toCharArray();

            int atingido = 0;

            for (int j = 0; j < Alturapartes.length; j++) {
                int altura = Integer.parseInt(Alturapartes[j]);

                if ((altura > 2 && paradoSaltandoArray[j] == 'J') || (altura <= 2 && paradoSaltandoArray[j] == 'S')) {
                    atingido++;
                }
            }

            System.out.println(atingido);
        }

        scanner.close();
    }
}
