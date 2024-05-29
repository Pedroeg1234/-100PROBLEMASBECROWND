/**
 * EconomicPhonebook
 */

 import java.util.*;
public class EconomicPhonebook {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<String> entradas= new ArrayList<>();


        for (int i=0;i<n;i++){

            String entrada= scanner.nextLine();

            entradas.add(entrada);
        }

        String primeiraPessoa= entradas.get(0);
       int total=0;

           for (int j=1; j<n; j++){

            int cont=0;

            for (int k=0;k<primeiraPessoa.length(); k++){
            if (entradas.get(j).charAt(k) != primeiraPessoa.charAt(k)){

                total++;

            }
        }
    }

    System.out.println(total+1);
    }
}