#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){

    int n;

    scanf ("%d", &n);

    for (int i=0;i<n;i++){

        char entrada[100];
        char cuttof[100];

        scanf("%s %s", entrada, cuttof);

        float entradaFloat= atof(entrada); // Convertendo o char para double
        float cuttofFloat= atof(cuttof);


        int entradaInteira= (int) entradaFloat;

        float parteDecimal= entradaFloat - entradaInteira;

        if (parteDecimal > cuttofFloat){

            entradaFloat+=1;
        } else{

            entradaFloat -=1;
        }

        int resultadoFinal= (int) entradaFloat;

        printf ("%d", resultadoFinal);
    }

return 0;

}