/**
 * noelLabels
 */

 import java.util.Scanner;
public class noelLabels {

    public static void main (String[] args){


        Scanner scanner= new Scanner (System.in);

        int n=scanner.nextInt();
        scanner.nextLine();
        int saida= scanner.nextInt();
        scanner.nextLine();

        String[] idiomas= new String[100];
        int contIdioma=0;
        String[] traducao= new String[100];
        int contTraducao=0;

        for (int i=0;i<n;i++){

            idiomas[contIdioma++] = scanner.nextLine() ;
            traducao[contTraducao++]= scanner.nextLine();


        }

        for (int i=0; i<saida;i++){

            String nome= scanner.nextLine();
            String idioma= scanner.nextLine();
            String tradutor="";
            for (int j=0;j<idiomas.length;j++){

                if (idioma.equals(idiomas[j])){
                    tradutor= traducao[j];
                }
            }

            System.out.println(nome);
            System.out.println(tradutor);
        }

    }
}