#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct {

    char nome[100];
    int peso;
    int idade;
    float altura;
} Rena;


    int compareTo(const void *a, const void *b){

        Rena *renaA = (Rena *) a;
        Rena *renaB = (Rena *) b;

        if (renaA ->peso != renaB ->peso){

            return renaB ->peso - renaA->peso;
        } else if(renaA -> idade != renaB -> idade){

            return renaA -> idade - renaB-> idade;
        } else{

            return renaA-> altura - renaB -> altura; 
        }

    }
int main(){

    int quantidadeVezes;
    scanf ("%d", &quantidadeVezes);
   
    for (int i=0;i<quantidadeVezes;i++){

         
        int quantidadeEntradas;
        int quantidadeSaidas;

        scanf("%d", &quantidadeEntradas);
        scanf ("%d", &quantidadeSaidas);

        Rena renas[quantidadeEntradas];

        for (int j=0;j<quantidadeEntradas;j++){

           

            scanf ("%s %d %d %f", &renas[j].nome, &renas[j].peso, &renas[j].idade, &renas[j].altura);

            
        }

        qsort(renas, quantidadeEntradas, sizeof(Rena), compareTo);
        for (int k=0;k<quantidadeSaidas;k++){

            printf (" %d %s \n", k+1, renas[k].nome);
        }
    }


    return 0;
}