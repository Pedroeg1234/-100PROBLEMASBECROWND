#include <stdio.h>
#include <string.h>

int main(){

    char entrada1 [200];
    char entrada2 [200];

    scanf ("%s", entrada1);
    scanf ("%s", entrada2);

    int tam= strlen(entrada1) + strlen(entrada2);

    char stringResultante[200]="";

    int contador=0;

    for (int i=0;i<tam;i+=2){

        if (i<strlen(entrada1)){

            stringResultante[contador++]= entrada1[i];
            stringResultante[contador++]= entrada1[i+1];
        }

        if (i < strlen(entrada2)){

            stringResultante[contador++]= entrada2[i];
            stringResultante[contador++]= entrada2[i+1];

        }

    }

    printf ("%s", stringResultante);
    
    return 0;

}