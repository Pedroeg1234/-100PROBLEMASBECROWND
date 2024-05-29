#include <stdio.h>
#include <string.h>



int main() {

    char entrada[1000];
    char delimitadores[] = " ";

    scanf(" %[^\n]", entrada);

    char tokens[100][100];
    int numTokens = 0;
    char *token = strtok(entrada, delimitadores);
    
    while (token != NULL && numTokens < 100) {
        strcpy(tokens[numTokens++], token);
        token = strtok(NULL, delimitadores);
    }

    int aliteracoes=0;
    for (int i=1; i<numTokens;i++){

        int qntd=0;
        char caractereAtual;
         caractereAtual= tokens[i][0];
        char caractereAnterior;
        caractereAnterior= tokens[i-1][0];


        while (caractereAtual == caractereAnterior){

            qntd++;
            i++;
            if (i<numTokens){

                caractereAnterior= tokens[i][0];
                caractereAtual= tokens[i-1][0];
            } else{
                break;
            }
        }

        if (qntd>0){
            aliteracoes++;
        }
    }

    printf ("%d", aliteracoes);    
    return 0;
}
