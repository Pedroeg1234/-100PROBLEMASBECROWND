/**
 * CantenQueue2
 */

import java.util.Scanner;
public class CantenQueue2 {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n=scanner.nextInt();

        for (int i=0;i<n;i++){


            int quantidadeNumeros= scanner.nextInt();
            int vetNumeros[]= new int[quantidadeNumeros];
            for (int j=0;j<quantidadeNumeros;j++){

                vetNumeros[j]= scanner.nextInt();

            }

            int vetClonado[]= new int[quantidadeNumeros];

            clonarVetor(vetNumeros, vetClonado, quantidadeNumeros);

            ordenarVetor(vetClonado, quantidadeNumeros);

            //for (int z=0;z<quantidadeNumeros;z++){

              //  System.out.println (vetClonado[z]);
            //}

            int inalterados=0;
            for (int k=0;k<vetClonado.length;k++){

                if (vetNumeros[k] == vetClonado[k]){

                    inalterados++;
                }
            }
            
            System.out.println (inalterados);
        }


    }

    public static void clonarVetor (int vetNumeros[], int VetClonado[], int tam){

        for (int i=0;i<tam;i++){

            VetClonado[i]= vetNumeros[i];
        }
    }

    public static void ordenarVetor(int vetClonado[], int tam) {
        for (int i = 0; i < tam - 1; i++) {
            int indiceMaior = i;
            for (int j = i + 1; j < tam; j++) {
                if (vetClonado[j] > vetClonado[indiceMaior]) { // Comparando com o índice do maior elemento
                    indiceMaior = j;
                }
            }
            if (indiceMaior != i) {
                // Trocando os valores do maior elemento com o elemento na posição corrente
                int temp = vetClonado[i];
                vetClonado[i] = vetClonado[indiceMaior];
                vetClonado[indiceMaior] = temp;
            }
        }
    }
    
}