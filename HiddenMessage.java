import java.util.Scanner;

public class HiddenMessage{
//OBEJETIVO: PEGAR A PRIMEIRA LETRA QUANDO DIVIDE A STRING USANDO SPLIT
    public static void main(String[] args){

        Scanner scanner= new Scanner (System.in);

        String frase= scanner.nextLine();
        StringBuilder str= new StringBuilder();

        String[] partes = frase.split("\\.");

        for (int j=0; j<partes.length;j++){
            String parteAtual= partes[j];
            for (int k=0;k<parteAtual.length(); k++){

                if (Character.isLetter(parteAtual.charAt(k))) {

                    str.append(parteAtual.charAt(k));
                    break;
                }
            }
            }

            System.out.println (str);
        }

    }
