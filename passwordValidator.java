/**
 * passwordValidator
 */
import java.util.Scanner;

public class passwordValidator {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        String entrada= scanner.nextLine();

        int quantidadeCaracteres=0;
        int quantidadeMaiuscula=0;
        int quantidadeDigitos=0;
        for (int i=0;i<entrada.length();i++){

            char caractereAtual= entrada.charAt(i);

            if (Character.isLowerCase(caractereAtual)){

                quantidadeCaracteres++;

            } else if (Character.isUpperCase(caractereAtual)){

                quantidadeMaiuscula++;
            } else if (Character.isDigit(caractereAtual)){

                quantidadeDigitos++;
            } else{

                quantidadeCaracteres=0;
                quantidadeMaiuscula=0;
                quantidadeDigitos=0;

                break;
            }
        }

        if (quantidadeCaracteres >0 && quantidadeMaiuscula >0 && quantidadeDigitos >0){

            System.out.println("Senha Válida");
        } else{

            System.out.println ("Senha inválida");

        }
    }
}