import java.util.Scanner;


public class dancingsentence{

public static void main(String[] args) {
    
    Scanner scanner= new Scanner (System.in);
    String frase= scanner.nextLine();

    boolean maiuscula=true;
    StringBuilder str= new StringBuilder();

    for (int i=0;i<frase.length();i++){

        char caractereAtual= frase.charAt(i);

        if (Character.isLetter(caractereAtual)){

            if (maiuscula){

                char caractereMaiusculo= Character.toUpperCase(caractereAtual);
                str.append(caractereMaiusculo);
            } else {

                char caractereMinusculo= Character.toLowerCase(caractereAtual);
                str.append(caractereMinusculo);
            }

            maiuscula=!maiuscula;
        } else {

            str.append(" ");
        }

        

    }
    
    System.out.println (str);
    
    }   
}