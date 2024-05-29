#include <stdio.h>

int main(){


    int n;

    scanf ("%d", &n);
    for (int i=0;i<n;i++){

        char entrada[200];

        scanf (" %[^\n]", entrada);

        int abertos=0;
        int diamantes=0;
        for (int j=0;j<strlen(entrada); j++){

            if (entrada[j] == '<'){

                abertos++;
            } else if (entrada[j] =='>' && abertos>0){
                abertos--;
                diamantes++;
            }
        }

        printf ("%d", diamantes);
    }

    return 0;
}