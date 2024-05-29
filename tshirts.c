#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    
    char nome[100];
    char cores[100];
    char tamanho[3];
} Camisas;

int compareTo(const void *a, const void *b){

    Camisas *CamisasA = (Camisas *) a;
    Camisas *CamisasB = (Camisas *) b;

    int cmp = strcmp (CamisasA -> cores, CamisasB -> cores);

    if (cmp !=0){

        return cmp;
    }
 
    cmp = strcmp (CamisasB-> tamanho, CamisasA -> tamanho);
    if (cmp !=0){

        return cmp;
    }

   
   return strcmp (CamisasA -> nome, CamisasB -> nome);
    }
    

int main(){

    for (int in=0; in<2;in++){
        int n;
        
        scanf ("%d", &n);
        Camisas camisa[n];
        for (int i=0;i<n;i++){

          scanf (" %[^\n]", camisa[i].nome);
          scanf ( "%s %s" , camisa[i].cores, camisa[i].tamanho);

        }

        qsort(camisa, n, sizeof(Camisas), compareTo);

        for (int i=0;i<n;i++){

            printf ("%s %s %s \n", camisa[i].cores, camisa[i].tamanho, camisa[i].nome );

        }
    }
    



    return 0;
}