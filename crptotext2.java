import java.util.Scanner;


public class crptotext2{


    public static void main(String[] args){

        Scanner scanner= new Scanner (System.in);

        int n=scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            String entrada=scanner.nextLine();
            StringBuilder str= new StringBuilder();
            StringBuilder strReversa= new StringBuilder();
            for (int j=0;j<entrada.length();j++){

                char caracterAtual= entrada.charAt(j);

                if (Character.isLowerCase(caracterAtual)){

                    str.append(caracterAtual);
                }

            }

            int tam= str.toString().length();

            for (int k=tam-1;k>=0;k--){

                strReversa.append(str.charAt(k));
            }

            System.out.println(strReversa);
        }
    }
}