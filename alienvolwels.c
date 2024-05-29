#include <stdio.h>
#include <string.h>

int main(){

    char vogais[100];
    char entrada[100];
    int quantidadeVogais=0;

    scanf ("%s", vogais);
    scanf (" %[^\n]", entrada);

    int tam=strlen(entrada);

    for (int i=0;i<tam; i++){

        char caractereAtual= entrada[i];

        for (int j=0;j<strlen(vogais);j++){

            if (caractereAtual== vogais[j]){

                quantidadeVogais++;
                break;
            }
        }
    }

    printf ("%d", quantidadeVogais);
    return 0;
}