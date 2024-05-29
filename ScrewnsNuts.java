import java.util.ArrayList;
import java.util.Scanner;


public class ScrewnsNuts{


    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> valores = new ArrayList<>();
        for (int i=0; i<n;i++){

            String intervalo= scanner.nextLine();

            String partes[]= intervalo.split(" ");

            int DeOnde= Integer.parseInt(partes[0]);
            int ParaOnde= Integer.parseInt(partes[1]);

            for (int j=DeOnde; j<=ParaOnde; j++){

                valores.add(j);                
            }
        }

        int valoresDesejado= scanner.nextInt();
        scanner.nextLine();

        selectionSort(valores);

        ArrayList<Integer> posicoes = new ArrayList<>();
        for (int i=0;i<valores.size();i++){

            if (valores.get(i) == valoresDesejado ){

                posicoes.add(i);
            }
        }

        for (int z=0;z< posicoes.size(); z++){

            System.out.println (posicoes.get(z));
        }


        if (posicoes.size() !=0){
        int menor= posicoes.get(0);
        int maior= posicoes.get(posicoes.size()-1);

        System.out.println(valoresDesejado + " found from " + menor + " to " + maior );
        } else {

            System.out.println(valoresDesejado + " not found");
        }

        
    }

    public static void selectionSort(ArrayList<Integer> valores) {
        int n = valores.size();

        for (int i = 0; i < n - 1; i++) {
            int menorValorIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (valores.get(j) < valores.get(menorValorIndex)) {
                    menorValorIndex = j;
                }
            }

            // Troca os valores
            int temp = valores.get(menorValorIndex);
            valores.set(menorValorIndex, valores.get(i));
            valores.set(i, temp);
        }
    }
}
