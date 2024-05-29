import java.util.Scanner;

public class SortByLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            String frase = scanner.nextLine();
            String partes[] = frase.split(" ");

            selectionSort(partes, partes.length);

            for (String parte : partes) {
                System.out.print(parte + " ");
            }
            System.out.println(); 
        }

       
    }

    public static void selectionSort(String partes[], int tam) {
        for (int i = 0; i < tam - 1; i++) {
            int indiceMaior = i;
            for (int j = i + 1; j < tam; j++) {
                if (partes[j].length() > partes[indiceMaior].length()) {
                    indiceMaior = j;
                }
            }
            String temp = partes[i];
            partes[i] = partes[indiceMaior];
            partes[indiceMaior] = temp;
        }
    }
}
