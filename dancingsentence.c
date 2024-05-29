#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

int main(){


    char texto[1000];

    scanf (" %[^\n]", texto);

    int tamanho= strlen(texto);

    bool maiuscula= true;   

    for (int i=0;i<tamanho;i++){

        if (isalpha(texto[i])){
        if (maiuscula){

            texto[i]= toupper(texto[i]);

            maiuscula= !maiuscula;
        } else{

            texto[i]= tolower(texto[i]);
            maiuscula= !maiuscula;
        }

    }
}

    printf ("%s", texto);
    return 0;
}