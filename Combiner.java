import java.util.Scanner;

public class Combiner{


    public static void main(String[] args){

        //OBJETIVO: COMBINAR 2 STRINGS USANDO 2 VARIAVEIS DE CONTROLE.
        Scanner scanner= new Scanner (System.in);

        StringBuilder str= new StringBuilder();

        String frase= scanner.nextLine();

        String partes[]= frase.split(" ");

        String primeiraFrase= partes[0];
        String segundaFrase= partes[1];

        int tam= primeiraFrase.length() + segundaFrase.length();

        for (int i=0, j=0;i<tam;i++, j++){

            if (i<primeiraFrase.length()){

                str.append(primeiraFrase.charAt(i));
            }

            if (j<segundaFrase.length()){

                str.append(segundaFrase.charAt(j));
            }
        }

        System.out.println (str);
    }
}