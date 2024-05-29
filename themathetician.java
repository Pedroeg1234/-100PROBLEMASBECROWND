import java.util.Scanner;

public class themathetician {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();

        String[] partes = entrada.split("x");

        String parte1 = partes[0];
        String parte2 = partes[1];

        int parte1Int = Integer.parseInt(parte1);
        int parte2Int = Integer.parseInt(parte2);

        for (int i = parte2Int; i <= 10; i++) {
            if (parte1Int == parte2Int) {
                System.out.println(parte1 + " x " + parte2 + " = " + (parte1Int * parte2Int));
            } else {
                System.out.println(parte1 + " x " + parte2 + " = " + (parte1Int * parte2Int) + " && " +
                        parte2 + " x " + parte1 + " = " + (parte2Int * parte1Int));
            }
        }
        scanner.close();
    }
}
