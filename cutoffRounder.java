import java.util.Scanner;

public class cutoffRounder{


    public static void main(String[] args){

    Scanner scanner=new Scanner (System.in);

        int n=scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            String entrada= scanner.nextLine();
            String corte= scanner.nextLine();

            double entradaDouble= Double.parseDouble(entrada);
            double corteDouble= Double.parseDouble(corte);

            int entradaInt= (int) entradaDouble;

            double parteFracionaria= entradaDouble-entradaInt;

            if (parteFracionaria>corteDouble){

                entradaDouble+=1;
            } else{
                entradaDouble-=1;
            }

            System.out.println ((int)entradaDouble);


        }
    }
}