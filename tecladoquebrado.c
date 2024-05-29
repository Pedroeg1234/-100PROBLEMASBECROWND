#include <string.h>
#include <stdio.h>
#include <ctype.h>

int main(){

   

    while(1){

      

        char entrada[500];
        if (scanf(" %[^\n]", entrada) == EOF) {
            break;
        }
        char conteudoParenteses[200];
        int abre=0;
        int fecha=0;
        for (int j=0;j<strlen(entrada);j++){

            if (entrada[j] =='['){

                abre=j;
            } else if (entrada[j] ==']'){

                fecha=j;
            }
        }

      char beijus[300]="";
      int contadorBeijus=0;
      char resposta[500]="";
      int contadorResposta=0;
        for (int j=abre+1; j<fecha;j++){


            if (entrada[j] !='[' && entrada[j] !=']'){

              beijus[contadorBeijus++] = entrada[j];

            }
        }

      for(int k=0;k<strlen(beijus);k++){

         if (entrada[k] !='[' && entrada[k] !=']'){
        resposta[contadorResposta++] = beijus[k];
         }
      }

      for (int l=0;l<abre;l++){

         if (entrada[l] !='[' && entrada[l] !=']'){
        resposta[contadorResposta++] = entrada[l];
         }
      }

      for (int m= fecha+1; m<strlen(entrada);m++){
           if (entrada[m] !='[' && entrada[m] !=']'){
        resposta[contadorResposta++] = entrada[m];
           }
      }

      resposta[contadorResposta]= '\0';
      printf ("%s\n", resposta);
    }

    return 0;
}