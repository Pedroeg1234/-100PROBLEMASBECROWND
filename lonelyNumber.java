/**
 * lonelyNumber
 */

 import java.util.*;


public class lonelyNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        int n= scanner.nextInt();
        scanner.nextLine();

        String entrada= scanner.nextLine();
        String partes[] = entrada.split(" ");

        for (int i=0; i<n; i++){

            numeros.add (Integer.parseInt(partes[i]));
        }

        ArrayList<Integer> ValoresUnicos = new ArrayList<>();
        for (int j=0;j<numeros.size(); j++){

            boolean unico= true;
            for (int k=j+1 ; k< numeros.size(); k++){

                if (numeros.get(k).equals(numeros.get(j))){

                    unico=false;
                    break;
                }
            }

            if (unico){
                ValoresUnicos.add(numeros.get(j));
            }
        }
        
       
        int lonelyNumber=0;
        for (int y=0; y<ValoresUnicos.size(); y++){
            int resp=0;
            for (int z= 0; z< numeros.size(); z++){

                if (ValoresUnicos.get(y).equals(numeros.get(z))){

                    resp++;
                }
            }

            if (resp%2 !=0){

                lonelyNumber= ValoresUnicos.get(y);
                break;
            }
        }

        System.out.println(lonelyNumber);
       
    }
}