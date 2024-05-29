import java.util.Scanner;

public class advancingletters{


    public static void main(String[] args){

    Scanner scanner=new Scanner (System.in);
    int quantidade= scanner.nextInt();
    scanner.nextLine();

    for (int i=0;i<quantidade;i++){

        int diferenca=0;
        String entrada=scanner.nextLine();

        String partes[]= entrada.split(" ");

        String primeiraParte= partes[0];
        String segundaParte= partes[1];

        

        for (int j=0;j<primeiraParte.length();j++){
            int diff=0;
            diff=segundaParte.charAt(j) - primeiraParte.charAt(j);

            if (diff<0){
                diff+=26;
            }


            diferenca+=diff;



        }

        System.out.println(diferenca);
    }

    }


}