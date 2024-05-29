import java.util.Scanner;

public class Fillordontfill{


    public static void main (String[] args){

        Scanner scanner= new Scanner (System.in);

        String entrada= scanner.nextLine();

        String encaixa= scanner.nextLine();

        boolean fit= true;

        int tam= encaixa.length() -1;

        int contadorEncaixa=0;
        for (int i= entrada.length() -1 - tam; i<entrada.length(); i++){

            if (entrada.charAt(i)!=encaixa.charAt(contadorEncaixa++)){

               fit=false;
               break;
            } 
        }

        if (fit){

            System.out.println("Encaixa");
        } else {

            System.err.println("Não encaixa");
        }
    }
}