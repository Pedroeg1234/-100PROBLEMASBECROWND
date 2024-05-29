#include <stdio.h>
#include <string.h>


int main(){

    char entrada[200];
    char comparacao[200];

    scanf ("%s", entrada);
    scanf ("%s", comparacao);

    if (strstr(entrada,comparacao)){

        printf("Resistente");
    } else {
        
        printf ("Não resistente");
    }
    return 0;
}