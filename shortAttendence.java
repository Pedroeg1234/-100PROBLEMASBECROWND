/**
 * shortAttendence
 */

 import java.util.Scanner;
public class shortAttendence {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            int quantidadeAlunos= scanner.nextInt();
            scanner.nextInt();
            scanner.nextLine();

            for (int j=0;j<quantidadeAlunos;j++){

                int quantidadePresenca=0;
                double frequencia=0;
                String Nomealuno= scanner.nextLine();
                String presencaAluno= scanner.nextLine();

                for (int k=0; k<presencaAluno.length();k++){

                    if (presencaAluno.charAt(k)=='P' || presencaAluno.charAt(k)=='M'){

                        quantidadePresenca++;

                    }
                }

                frequencia = (double) quantidadePresenca / presencaAluno.length() * 100;

                if (frequencia <75){

                    System.out.println (Nomealuno);
                    System.out.println("\n");
                }
            }
        }
    }
}