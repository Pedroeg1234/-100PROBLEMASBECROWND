/**
 * joulupukki
 */
import java.util.Scanner;

public class joulupukki {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        String entrada=scanner.nextLine();

        String partes[]= entrada.split(" ");

        StringBuilder str= new StringBuilder();
        for (int i=0;i<partes.length;i++){

            if (partes[i]. contains("oulupukk")){

                str.append("Foulupukki ");

            } else{

                str.append(partes[i]+ " ");
            }
        }
        System.out.println(str);
    }
}