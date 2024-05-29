#include <stdio.h>
#include <string.h>

int main(){

int n;

scanf("%d", &n);

for (int i=0;i<n;i++){

    char primeiraEntrada[100];
    char segundaEntrada[100];
    char stringResultante[200]="";
    scanf("%s", primeiraEntrada);
    scanf("%s", segundaEntrada);

    int tam= strlen(primeiraEntrada) + strlen(segundaEntrada);

    int j=0;

    for (int k=0, l=0;k<tam;k++,l++){
    

        if (k<strlen(primeiraEntrada)){
            
            stringResultante[j++]=  primeiraEntrada[k];
        }

        if ( l< strlen(segundaEntrada)){

            stringResultante[j++]= segundaEntrada[l];
        }
    
    }
     printf ("%s", stringResultante);
}
   
}

