#include <stdio.h>
#include <string.h>


int main(){

    int valor;
    char entrada[200];

    scanf("%d", &valor);
    scanf ("%s",entrada );

    char str[200]="";

    int contador=0;
    for (int i=0;i<strlen(entrada); i++){

        if (entrada[i] != valor +'0'){

            str[contador++]= entrada[i];

        }
    }

    int sozero=1;
    for (int j=0;j<strlen(str);j++){

        if (str[j] !='0'){

            sozero=0;
        }
    }

    if (sozero){

        printf ("0");
    } else{
  printf ("%s", str);
    }




    return 0;
}