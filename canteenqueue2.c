#include <stdio.h>


void selectionSort(int numeros[], int n){

    int swaps=0;
    for (int i=0;i<n;i++){

        int indiceMenor= i;

        for (int j=i+1; j<n;j++){

            if (numeros[j] > numeros[indiceMenor]){

                indiceMenor=j;
                
            }
        }

        int temp= numeros[i];
        numeros[i] = numeros[indiceMenor];
        numeros[indiceMenor] = temp;
    }
}

void clonarVetor (int numeros[], int novoVet[], int quantidade){

    for (int i=0;i<quantidade;i++){

        novoVet[i] = numeros[i];
    }
}
int main(){

    int n;

    scanf ("%d", &n);

    for (int i=0;i<n;i++){

        int quantidadeNum;
        
        scanf ("%d", &quantidadeNum);

        int numeros[quantidadeNum];
        for (int j=0;j<quantidadeNum;j++){

            scanf ("%d", &numeros[j]);
        }

    int novoVet[quantidadeNum];
    clonarVetor(numeros, novoVet, quantidadeNum);
    selectionSort(novoVet,quantidadeNum);

    int inalterados=0;
    for (int k=0;k<quantidadeNum; k++){

        if (novoVet[k] == numeros[k]){

            inalterados++;
        }
    }



    printf ("%d\n", inalterados);
    }

    return 0;
}