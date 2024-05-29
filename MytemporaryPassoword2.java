import java.util.Scanner;

public class MytemporaryPassoword2{

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            String entrada=scanner.nextLine();
            int comeco=0;
            

            if (!entrada.contains("RA")){
                System.out.println ("INVALID DATA");
            }

            for (int j=0;j<entrada.length();j++){

                if (entrada.charAt(j)!='R' && entrada.charAt(j) !='A' && entrada.charAt(j) != '0'){
                    comeco=j;
                    break;
                }
            }

            StringBuilder str= new StringBuilder();
            for (int k=comeco;k<entrada.length();k++){

                str.append(entrada.charAt(k));
            }

            System.out.println(str);
        }

        

    }
}