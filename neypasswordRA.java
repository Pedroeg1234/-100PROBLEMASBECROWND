/**
 * neypasswordRA
 */

 import java.util.Scanner;

public class neypasswordRA {

    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        String entrada=scanner.nextLine();

        int tamanho= entrada.length();

        StringBuilder str= new StringBuilder();
        for (int i=0;i<tamanho;i++){

            char caractereAtual= entrada.charAt(i);

            if (caractereAtual=='a' || caractereAtual=='k' || caractereAtual=='u'){

                str.append('0');
            }

            if (caractereAtual=='b' || caractereAtual=='l' || caractereAtual=='v'){

                str.append ('1');
        }

        if (caractereAtual=='b' || caractereAtual=='l' || caractereAtual=='v'){

            str.append ('1');
    }
    }
}
}