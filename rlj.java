import java.util.Scanner;


public class rlj{


    public static void main(String[] args){

        Scanner scanner= new Scanner (System.in);

        String entrada=scanner.nextLine();

        String partes[]= entrada.split("[+=]");

        if (partes[0].equals("R")){

            int saida= Integer.parseInt(partes[2]) - Integer.parseInt(partes[1]);
            System.out.println (saida);

        } else if(partes[1].equals("L")){

            int saida= Integer.parseInt(partes[1]) - Integer.parseInt(partes[2]);
            System.out.println (saida);
        } else {

            int saida= Integer.parseInt(partes[0]) + Integer.parseInt(partes[1]);
            System.out.println (saida);
        }

        
    }
}