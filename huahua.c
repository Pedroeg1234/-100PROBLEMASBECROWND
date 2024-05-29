#include <stdio.h>
#include <string.h>


int main(){

    char entrada[100];
    char resultado[200]="";
    int j;
    scanf ("%s", entrada);

    int tam= strlen(entrada);

    for (int i=0;i<tam;i++){

        if (entrada[i]=='a' || entrada[i]=='e' || entrada[i]=='o' || entrada[i]=='i' || entrada[i]=='u'){

            resultado[j++]= entrada[i];
        }
    }

    int tamResultado= strlen(resultado);

    char ResultadoInvertido[200]="";

    int contador=0;
    for (int i=tamResultado-1;i>=0; i--){

        ResultadoInvertido[contador++]= resultado[i];


    }

    if (strcmp(resultado, ResultadoInvertido)==0){

        printf ("S");
    } else{

        printf ("N");
    }

}