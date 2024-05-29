
import java.util.Scanner;

public class insideOut {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        String entrada=scanner.nextLine();


        int esquerda= entrada.length()/2;
        int direita= entrada.length()-1;

        StringBuilder str= new StringBuilder();

        for (int i=esquerda -1;i>=0;i--){

            str.append(entrada.charAt(i));
        }

        for (int j=direita; j>=esquerda;j--){

            str.append(entrada.charAt(j));
        }

        System.out.println(str);
    }
    
}