#include <stdio.h>
#include <string.h>

int main(){


    int n;
    scanf ("%d", &n);

    for (int i=0;i<n;i++){

        int quantidadePessoas;
        int capacidade;

        scanf ("%d %d", &quantidadePessoas, &capacidade);

        int capacidadeMon= capacidade-1;

        float ocupacao= quantidadePessoas / capacidadeMon;

        int resp;
        if (ocupacao != 0){

            resp= ocupacao+1;
        }

        printf ("%d", resp);
    }

    return 0;
}