#include <stdio.h>
#include <string.h>

int main(){

    char entrada[200];

    scanf ("%s", entrada);

    int quantidadeLeiturasPorClocks=0;

    scanf ("%d", &quantidadeLeiturasPorClocks);

    int quantidadeClocks=0;
    int quantidadeLeituras=0;

    for (int i=0;i<strlen(entrada);i++){

        if (entrada[i]=='W'){

            quantidadeClocks++;

        }

        if (entrada[i]=='R'){

            quantidadeLeituras++;
        }
    }

    int aux= quantidadeLeituras/quantidadeLeiturasPorClocks;

    if (aux !=0){

        aux++;
    }

    quantidadeClocks+=aux;

    printf ("%d", quantidadeClocks);



    return 0;
}