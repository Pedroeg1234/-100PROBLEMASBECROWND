import java.util.Scanner;

public class bacteria1{


    public static void main(String[] args){

        Scanner scanner= new Scanner (System.in);


        String entrada= scanner.nextLine();
        String comparacao= scanner.nextLine();

        if (entrada.contains(comparacao)){

            System.out.println ("Resistente");
        } else{
            return;
        }
    }
}