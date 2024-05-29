import java.util.Scanner;

public class PaulaMath{

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            String entrada= scanner.nextLine();

            char somaSub= entrada.charAt(1);
            int soma=0;
            int subtracao=0;
            int primeiroNumero=Character.getNumericValue( entrada.charAt(0));
            int segundoNumero= Character.getNumericValue( entrada.charAt(2));
            if (Character.isUpperCase(somaSub)){

                subtracao= segundoNumero-primeiroNumero;
                System.out.println(subtracao);
            } else{

                soma= primeiroNumero+ segundoNumero;
                System.out.println (soma);
            }
        }
    }
}