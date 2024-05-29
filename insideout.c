#include <stdio.h>
#include <string.h>

int main(){

    char entrada[100]= "";

    scanf (" %[^\n]", entrada);

    char stringResultante[400] = "";


    int meio= strlen(entrada)/2;
    
    int final= strlen(entrada)-1;

    int contador=0;

    for (int i=meio-1;i>=0;i--){

        stringResultante[contador++]= entrada[i];

    }

    for (int j=final;j >=meio;j--){

        stringResultante[contador++]= entrada[j];
    }

    printf ("%s", stringResultante);


    return 0;
}