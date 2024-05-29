#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int main(){

   

    for (int j=0;j < 2;j++){

         int n;
    scanf("%d", &n);

    int horas[n];
    int minutos[n];
    int tempoEspera[n];
    for (int i=0;i<n;i++){

        scanf ("%d %d %d", &horas[i], &minutos[i], &tempoEspera[i]);
    }

    int tempoTotal = (horas[0] *60) + minutos[0];
    int cont=0;
    for (int i=0; i<n;i++){

        int tempoPaciente = (horas[i]*60) + minutos[i] + tempoEspera[i];
        int horaChegada= (horas[i]*60) + minutos[i];

        if(horaChegada > tempoTotal){

            tempoTotal = horaChegada;
        }

        if (tempoTotal > tempoPaciente){

            cont++;
        }

    tempoTotal+=30;        
    }
    
    printf ("%d\n", cont);

    }
    return 0;
}