#include <stdio.h>
#include <string.h>

int main(){

    int n;

    scanf ("%d", &n);

    for (int i=0; i<n;i++){

        int qntdpalavras;
        scanf ("%d", &qntdpalavras);

        char palavras[qntdpalavras][100];
        int unico=1;
        for (int j=0; j< qntdpalavras;j++ ){

            scanf ("%s", palavras[j]);

        }

        for (int k=0;k<qntdpalavras;k++){

            char palavraAtual[200];
            strcpy(palavraAtual, palavras[k]);

            for (int l=k+1; l<qntdpalavras;l++){

                if (strcmp(palavraAtual, palavras[l]) !=0){

                    unico=0;
                    break;
                }

            }
        }

        if (unico==1){
            printf ("%s", palavras[0]);
        } else{

            printf("inglês");
        }


    }

    return 0;
}