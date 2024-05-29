#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){

int n;

scanf ("%d", &n);

for (int i=0;i<n;i++){

    char entrada[100];
    char StringFinal[100]="";
    scanf ("%s", entrada);

    int l=0;

    for (int j=0;j<strlen(entrada);j++){

        char caractereAtual= entrada[j];

        if (islower(caractereAtual)){

            StringFinal[l++]= caractereAtual;
        }
        
    }

    int tam= strlen(StringFinal);
    char StringInversa[200]="";

     int m=0;
    for (int k=tam-1; k>=0; k--){

       
        StringInversa[m]= StringFinal[k];
        m++;
    }

    printf ("%s", StringInversa);
}
return 0;
}