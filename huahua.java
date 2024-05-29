import java.util.Scanner;

public class huahua{

//INVERTER A STRING E VERIFICAR SE É IGUAL
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        String frase=scanner.nextLine();
        StringBuilder str= new StringBuilder();
        StringBuilder strInvertida= new StringBuilder();


        for (int i=0;i<frase.length();i++){

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
            || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {

                str.append(frase.charAt(i));

            }
        }

        for(int i=str.length()-1;i>=0;i--){

            strInvertida.append(str.charAt(i));

        }

        if (str.toString().equals(strInvertida.toString())){
            System.out.println("S");
        } else{
            System.out.println ("N");
        }
    }
}