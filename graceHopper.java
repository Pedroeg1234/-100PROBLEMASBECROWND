/**
 * graceHopper
 */

 import java.util.Scanner;


public class graceHopper {

    public static void main(String[] args) {
    
        Scanner scanner= new Scanner(System.in);

        String entrada= scanner.nextLine();

        String partes[]= entrada.split("-");

      
            if (partes.length==5){
    
                if ((partes[0].toLowerCase().charAt(0) != 'C' || partes[partes.length - 1].charAt(0) != 'C') &&
                    (partes[1].toLowerCase().charAt(0) != 'O' || partes[partes.length - 1].charAt(0) != 'O') &&
                    (partes[2].toLowerCase().charAt(0) != 'B' || partes[partes.length - 1].charAt(0) != 'B') &&
                    (partes[3].toLowerCase().charAt(0) != 'O' || partes[partes.length - 1].charAt(0) != 'O') &&
                    (partes[4].toLowerCase().charAt(0) != 'L' || partes[partes.length - 1].charAt(0) != 'L')) {

                
                System.out.println("BUG");
            
            }       
                
            else {
        
                System.out.println("GRACE HOPPER");
            }

            }    else{

                System.out.println("BUG");
            }
}
}
