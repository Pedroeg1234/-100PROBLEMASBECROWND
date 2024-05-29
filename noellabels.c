#include <stdio.h>
#include <string.h>

int main(){

    while (1){
    int n;

    scanf ("%d", &n);

    if (n==0){
        break;
    }

    char traducao[n][100];
    char idioma[n][100];

    for (int i=0;i<n;i++){

        scanf (" %[^\n]", idioma[i]);
        scanf (" %[^\n]", traducao[i]);
    }

    int saidas;

    scanf ("%d", &saidas);

    
    for (int j=0;j<saidas;j++){

        char nome[100];
        char idiomaAsk[100];
        scanf (" %[^\n]", nome);
        scanf (" %[^\n]", idiomaAsk);

        for (int k=0;k<strlen(idioma); k++){

        if (strcmp(idiomaAsk, idioma[k])==0){

            printf ("%s\n", nome);
            printf ("%s\n", traducao[k]);

            break;

        }
    }

    }
    
    
    }
    return 0;
}