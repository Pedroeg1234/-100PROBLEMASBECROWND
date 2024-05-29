#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){

    int n;

    scanf ("%d", &n);


    for (int i=0;i<n;i++){

        char entrada[200];
        scanf (" %[^\n]", entrada);
        char resp[100]="";
        int contador=0;
        int verifPrimeiro= 0;
        for (int j=0;j<strlen(entrada); j++){

            if (verifPrimeiro==0){
            if (isalpha (entrada[0])){

                resp[contador++]= entrada[0];
                verifPrimeiro=1;
            }
            }
            if (j>0 && isalpha(entrada[j]) && entrada[j-1]=='.'){

                resp[contador++]= entrada[j];
            }
        }
        int tam= strlen(resp);
        resp[tam]= '\0';
        printf (resp);
    }
    return 0;
}