import java.util.Scanner;

public class bhaskara {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
       

        for (int i = 0; i < n; i++) {

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double bhaskara = b * b - 4 * a * c;

            if (bhaskara < 0) {
                System.out.println("Impossivel Calcular");
            } else {
                double raiz1 = (-b + Math.sqrt(bhaskara)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(bhaskara)) / (2 * a);

                System.out.printf("%.5f", raiz1);
                System.out.printf("%.5f", raiz2);
            }
        }
    }
}
