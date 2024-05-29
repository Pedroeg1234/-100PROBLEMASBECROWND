#include <stdio.h>
#include <string.h>

int main(){

    int capacidadeCabine;
    int numAlunos;

    scanf ("%d", &capacidadeCabine);
    scanf ("%d", &numAlunos);

    int viagens= numAlunos/ (capacidadeCabine-1);
    
    if (numAlunos % (capacidadeCabine-1) !=0){

        viagens++;
    }

    printf ("%d", viagens);
    return 0;
}
