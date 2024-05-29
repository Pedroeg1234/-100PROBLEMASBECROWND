import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList{


    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            String comidas= scanner.nextLine();

            String partesComidas[]= comidas.split(" ");

            ArrayList<String> ComidasSemRepetidas = new ArrayList();
            for (int j=0; j< partesComidas.length;j++){

                boolean unico = true;
                for (int k=j+1; k< partesComidas.length;k++){

                    if (partesComidas[k].equals(partesComidas[j])){

                        unico=false;
                    }

                }

                if(unico){

                    ComidasSemRepetidas.add(partesComidas[j]);
                }

            }
            SelectionSort(ComidasSemRepetidas);

            for (int l=0;l<ComidasSemRepetidas.size();l++){

                System.out.println(ComidasSemRepetidas.get(l));
            }
        }

    }

    public static void SelectionSort(ArrayList<String> ComidasSemRepetidas ){

        int n = ComidasSemRepetidas.size();
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i; j < n; j++) {

                if (ComidasSemRepetidas.get(j).compareTo(ComidasSemRepetidas.get(menor)) < 0) { // Correção: usar get()
                    menor = j;
                }
            }

            String temp = ComidasSemRepetidas.get(menor); // Correção: usar get()
            ComidasSemRepetidas.set(menor, ComidasSemRepetidas.get(i)); // Correção: usar set()
            ComidasSemRepetidas.set(i, temp); // Correção: usar set()
        }

    }
}