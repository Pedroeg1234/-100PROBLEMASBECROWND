import java.util.Scanner;

public class encryptedChristimans{

    //Cada chamada de replace substitui todas as ocorrências do caractere
    //especificado na string original pelo caractere de substituição.
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);


        String frase= scanner.nextLine();

        String traducao= replaceCaracteres(frase);

        System.out.println (traducao);

    }

    public static String replaceCaracteres (String frase) {
        
        frase = frase.replace("@", "a");
        frase = frase.replace("&", "e");
        frase = frase.replace("!", "i");
        frase = frase.replace("*", "o");
        frase = frase.replace("#", "u");

        return frase;
    }
}