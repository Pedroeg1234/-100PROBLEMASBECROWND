import java.util.Scanner;

public class alienvolwels{


    public static void main (String[] args){

        Scanner scanner= new Scanner(System.in);

        String vogais= scanner.nextLine();

        char[] vetorDeCaracteres = vogais.toCharArray();

        String frase= scanner.nextLine();

        int quantidadevogais=0;
        for (int i=0;i<frase.length();i++){

            char caractereAtual= frase.charAt(i);
            for (int j=0;j<vetorDeCaracteres.length;j++){

                if (caractereAtual==vetorDeCaracteres[j]){

                    quantidadevogais++;
                }
            }
        }

        System.out.println(quantidadevogais);
       
    }
}