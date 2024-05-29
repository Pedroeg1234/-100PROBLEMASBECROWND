import java.util.*;

public class cifradeCesar {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int deslocamento= scanner.nextInt();
        scanner.nextLine();

        StringBuilder str= new StringBuilder();
        String frase= scanner.nextLine();

        for (int i=0;i<frase.length();i++){

            char caractereAtual= frase.charAt(i);

            char caractereModificado= (char) (caractereAtual-deslocamento);

            if (caractereModificado < 'a') {
                caractereModificado = (char) (caractereModificado + 26);
            } else if (caractereAtual < 'A') {
                caractereModificado = (char) (caractereModificado + 26);
            }
            
            str.append(caractereModificado);


        }

        System.out.println(str);
    }
}