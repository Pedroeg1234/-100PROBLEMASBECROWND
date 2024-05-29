#include <stdio.h>
#include <string.h>


void ordenarVetor (int vet[], int tam){


    for (int i=0;i<tam; i++){

        int indiceMenor=i;

        for (int j=i+1; j< tam;j++){

            if (vet[j] < vet[indiceMenor]){

                indiceMenor=j;
            }
        }

        int temp= vet[i];
        vet[i] = vet[indiceMenor];
        vet[indiceMenor] = temp;
    }
}

void ordenarDecrescente (int vet[], int tam){


    for (int i=0;i<tam; i++){

        int indiceMenor=i;

        for (int j=i+1; j< tam;j++){

            if (vet[j] > vet[i]){

                indiceMenor=j;
            }
        }

       int temp= vet[i];
       vet[i]= vet[indiceMenor];
       vet[indiceMenor] = temp;
    }
}
int main(){

    int n;

    scanf ("%d", &n);

    int pares[n];
    int contImpar=0;
    int impares[n];
    int contPar=0;

    for (int j=0;j<n;j++){

        int numero;

        scanf ("%d", &numero);

        if (numero %2 ==0){

            pares[contPar++] = numero;
        } else{

            impares[contImpar++] = numero;
        }

    }

    ordenarVetor (pares, contPar);
    ordenarDecrescente(impares, contImpar);

    int vetorCompleto[n];
    int contVetorCompleto=0;
    for (int i=0;i<contPar;i++){

      vetorCompleto[contVetorCompleto++] = pares[i];
      
    }

    for (int i=0;i<contImpar;i++){

      vetorCompleto[contVetorCompleto++] = impares[i];
    }

  for (int i=0;i<n;i++){

    printf ("%d ", vetorCompleto[i]);
  }
    return 0;
}