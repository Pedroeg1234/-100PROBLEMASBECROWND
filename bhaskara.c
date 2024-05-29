#include <stdio.h>
#include <string.h>
#include <math.h>

int main(){

    int n;

    scanf ("%d", &n);

    for (int i=0;i<n;i++){

        int a,b,c;

        scanf ("%d", &a);
        scanf ("%d", &b);
        scanf ("%d", &c);

        float bhaskara= b*b -4*a*c;

        int podeCalcular=1;
        if (bhaskara <0){

            printf ("Impossivel Calcular\n");
            podeCalcular=0;
        }

        if (podeCalcular==1){
        float raiz1= -b + sqrt(bhaskara) / 2*a;
        float raiz2= b - sqrt(bhaskara) / 2*a;

        printf ("%f\n", raiz1);
        printf ("%f\n", raiz2);
    }
    }

    return 0;
}