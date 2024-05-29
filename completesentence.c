#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){

    int n;

    scanf ("%d", &n);

    for (int i=0;i<n;i++){

        char entrada[200];

        scanf (" %[^\n]", entrada);
        int alfabeto[26];
        int contador=0;
        //INICIALIZAR TODO O ARRAY COM 0.
        for (int z=0;z<26;z++){

            alfabeto[z]= 0;
        }
        for (int j=0;j<strlen(entrada);j++){

            char caractereAtual= entrada[j];
            if (isalpha(caractereAtual)){

                int indice= tolower(caractereAtual) - 'a';

                if (alfabeto[indice]==0){

                    alfabeto[indice]
                    =1;
                    contador++;
                }
            }

        }

        printf ("%d\n", contador);
    }

    return 0;
}