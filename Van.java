/**
 * Van
 */


 import java.util.Scanner;

public class Van {

    public static void main(String[] args) {
        

        Scanner scanner= new Scanner (System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        String nomes[] = new String[n];
        String regioes[]= new String[n];
        int distancia[]= new int[n];


        for (int i=0;i<n;i++){
        String entrada= scanner.nextLine();
        String partes[] = entrada.split(" ");

        nomes[i]= partes[0];
        regioes[i] = partes[1];
        distancia[i]= Integer.parseInt(partes[2]);

        }

        //SELECTION SORT 

        for (int i=0; i< n; i++){

            int indiceMenor=i;

            for (int j= i+1; j<n;j++){

                if (distancia[j] < distancia[indiceMenor]){

                    indiceMenor=j;
                }
            }

            if (indiceMenor !=i){

                String tmpNomes= nomes[i];
                nomes[i] = nomes[indiceMenor];
                nomes[indiceMenor] = tmpNomes;
            

             // Troca as regiões
             String tmpRegioes = regioes[i];
             regioes[i] = regioes[indiceMenor];
             regioes[indiceMenor] = tmpRegioes;

             // Troca as distâncias
             int tmpDistancias = distancia[i];
             distancia[i] = distancia[indiceMenor];
             distancia[indiceMenor] = tmpDistancias;
         }
        }

        for (int i=0;i<n;i++){

            System.out.println(nomes[i]);
        }
    }
}