#include <stdio.h>
#include <string.h>

int main(){

    char frase1[100];
    char frase2[100];

    scanf ("%s", frase1);
    scanf ("%s", frase2);

    int tam= strlen(frase1) + strlen(frase2);

    char StringFinal[200]= "";


    for (int i=0, j=0, k=0;i<tam;i++, j+=2, k+=2){

        if (j<strlen(frase1)){

            StringFinal[i]+=frase1[j];
            StringFinal[i+1]+=frase1[j+1];
        }

        if (k<strlen(frase2)){

            StringFinal[i+2]+= frase2[k];
            StringFinal[i+3]+= frase2[k+1];
        }
    }

    printf ("%s", StringFinal);
    return 0;
}