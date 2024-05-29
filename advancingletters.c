#include <stdio.h>
#include <string.h>

int main(){


    int diferenca;

    scanf ("%d", &diferenca);


    for (int i=0;i<diferenca;i++){

    char primeirafrase[100];
    char segundafrase[100];

    int diferenca=0;

    scanf ("%s %s", primeirafrase, segundafrase);

    for (int j=0;j<strlen(primeirafrase);j++){

        int diff=0;
        diff= segundafrase[j] - primeirafrase[j];

        if (diferenca<0){
            diff+=26;
        }
        diferenca+=diff;
    
    }

    printf ("%d", diferenca);
        
    }
}