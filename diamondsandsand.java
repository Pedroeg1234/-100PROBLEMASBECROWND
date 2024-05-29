/**
 * diamondsandsand
 */

 import java.util.Scanner;
public class diamondsandsand {

    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        String frase= scanner.nextLine();

        int quantidade=0;
        int aberto=0;
        for (int i=0; i< frase.length(); i++){

            if (frase.charAt(i) == '<'){

                aberto++;
            } else if(frase.charAt(i) == '>'){

                if (aberto >0){

                    aberto--;
                    quantidade++;
                }
            }

        }

        System.out.println(quantidade);
    }
}