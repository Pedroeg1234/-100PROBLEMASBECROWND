#include <stdio.h>
#include <string.h>

int main(){

    int n=0;

    scanf ("%d", &n);
    char pokemons[n][100];
    int quantidadeUnicos=0;
    for (int i=0;i<n;i++){

        scanf ("%s", pokemons[i]);

    }

    for (int j=0;j<n;j++){

        int unico=1;

        for (int k=0; k<j;k++){

            if (strcmp(pokemons[j], pokemons[k]) == 0) { 
                unico=0;
                break;
            }
        }

        if (unico==1){

             quantidadeUnicos++;
        }
    }


    int quantidadefinal= 151-quantidadeUnicos;

    printf("%d", quantidadefinal);

    return 0;

}