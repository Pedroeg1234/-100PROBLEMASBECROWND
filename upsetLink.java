import java.util.Scanner;

public class upsetLink{

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        String entrada=scanner.nextLine();

        String entradaMinuscula= entrada.toLowerCase();

        if (entradaMinuscula.contains("zelda")){

        System.out.println ("Link Bolado");

        } else{

            System.out.println ("Link Tranquilo");
        }
    }
}