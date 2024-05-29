/**
 * completeSentence
 */

 import java.util.Scanner;
public class completeSentence {

    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            String entrada= scanner.nextLine();
            boolean[] alfabeto= new boolean[26];
            int contador=0;
            for (int j=0;j<entrada.length();j++){

                char caractereAtual= entrada.charAt(j);
                

                if (Character.isLetter(caractereAtual)){

                    int indice= Character.toLowerCase(caractereAtual) -'a';

                    if (alfabeto[indice]==false){

                        alfabeto[indice]= true;
                        contador++;
                    }
                }
            }
                System.out.println(contador);
            }
        }
    }
