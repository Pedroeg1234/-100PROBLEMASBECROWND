#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){

    int qntdVezes;
    scanf ("%d", &qntdVezes);

    for (int i=0;i<qntdVezes;i++){

        int qntdNumeros;
        scanf ("%d", &qntdNumeros);
        
        int vetNumeros[qntdNumeros];
        for (int j=0;j<qntdNumeros;j++){

            scanf ("%d", &vetNumeros[j]);
        }

        int ApareceMaisDe3[qntdNumeros];
        int contAparece=0;
        for (int k=0;k<qntdNumeros;k++){

            int qntd=0;
            int numAtual= vetNumeros[k];

            for (int l=0; l<qntdNumeros; l++){

                if (numAtual == vetNumeros[l]){

                    qntd++;
                }

                if (qntd >=3){

                    ApareceMaisDe3[contAparece++]= numAtual;
                    break;
                }

            }
        }
        
        int ApareceMaisDe3Unico[10];
        int contThis=0;
        for (int z=0;z< contAparece; z++){
            int unico=1;

            for (int g=z+1; g<contAparece; g++ ){

                if (ApareceMaisDe3[z] == ApareceMaisDe3[g]){

                    unico=0;
                    break;
                }
            }

            if (unico){

                ApareceMaisDe3Unico[contThis++]= ApareceMaisDe3[z];
                
            }
        }

        if (contThis >0 ){
        for (int gg= 0; gg< contThis; gg++){

            printf ("%d ", ApareceMaisDe3Unico[gg]);
        }
    } else{

       printf ("-1");
    }
}

    return 0;
}