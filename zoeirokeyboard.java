/**
 * zoeirokeyboard
 */
import java.util.Scanner;

public class zoeirokeyboard {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int substituicoes= scanner.nextInt();
        scanner.nextLine();

        int quantidadeFrases= scanner.nextInt();
        scanner.nextLine();

        char[] original= new char[substituicoes];
        char[] modificado= new char[substituicoes];
        for (int i=0;i<substituicoes;i++){

            String trocas= scanner.nextLine();

            String[] partes= trocas.split(" ");

            original[i]= partes[0].charAt(0);
            modificado[i]= partes[1].charAt(0);
        }

        for (int i=0;i<quantidadeFrases;i++){

            StringBuilder str= new StringBuilder();
            String frase=scanner.nextLine();

            for (int j=0;j<frase.length();j++){
                boolean modificou= false;
                char caractereAtual= frase.charAt(j);

                for (int k=0;k<original.length;k++){

                    if (caractereAtual==modificado[k]){

                        str.append(original[k]);
                        modificou=true;
                        break;
                    } else if (caractereAtual==original[k]){

                        str.append(modificado[k]);
                        modificou=true;
                        break;
                    }
                }

                if (!modificou){
                    str.append(caractereAtual);
                }
            }

            System.out.println(str);
        }

    

    }
}