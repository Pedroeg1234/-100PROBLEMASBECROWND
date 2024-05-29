#include <stdio.h>
#include <string.h>

int main(){

    int n;

    scanf ("%d", &n);

    char entrada[200];
    char ultimosNumeros[200];

    scanf ("%s", entrada);
    scanf ("%s", ultimosNumeros);

    int tamanho= strlen(ultimosNumeros);
    int tamanhoEntrada= strlen(entrada);

    int fit=1;
    int cont=0;
    for (int i=tamanhoEntrada- tamanho;i<tamanhoEntrada;i++){

        if (entrada[i] != ultimosNumeros[cont++]){

            fit=0;
            break;

        }
    }
    
    if (fit==1){
        printf ("Encaixa");
    } else{

        printf ("Não Encaixa");
    }
    return 0;
}