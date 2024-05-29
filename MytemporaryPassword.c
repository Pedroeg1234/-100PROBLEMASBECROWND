#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){

    int n;
   
    scanf ("%d", &n);

    for (int i=0;i<n;i++){

         char entrada[200];
         char senha[100]="";
         int indice=0;
        scanf ("%s", entrada);

        
        if (entrada[0]!='R' || entrada[1]!='A'){
            printf ("INVALID DATA");
            break;
        }

        for (int j=0;j<strlen(entrada); j++){

            if (isdigit(entrada[j])){

                if (entrada[j] !=  '0'){

                    indice=j;
                    break;
                }
            }
        }

        int contador=0;
        for (int k=indice; k<=strlen(entrada);k++){

            senha[contador++]= entrada[k];
        }

         printf ("%s", senha);
    }

   

    return 0;
}