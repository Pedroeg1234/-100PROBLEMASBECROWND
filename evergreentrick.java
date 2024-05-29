import java.util.Scanner;


public class evergreentrick{

    public static void main(String[] args) {
        
    
    Scanner scanner= new Scanner (System.in);

    String frase1= scanner.nextLine();
    String frase2= scanner.nextLine();


    int tam= frase1.length() + frase2.length();

        StringBuilder str= new StringBuilder();


    for (int i=0, j=0, z=0; i<tam;i++, j+=2, z+=2){

      if (j<frase1.length()){

        str.append(frase1.charAt(j));
        str.append(frase1.charAt(j+1));

        if (z<frase2.length()){
        str.append(frase2.charAt(z));
        str.append(frase2.charAt(z+1));
        }
      }

    }

    System.out.println (str);

    }
}