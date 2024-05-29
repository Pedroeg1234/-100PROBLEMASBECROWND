#include <stdio.h>
#include <string.h>

int main(){

    char palavras[][10]= {"one", "two", "three"};


    int n;
    scanf ("%d", &n);
   
    for(int i=0;i<n;i++){

         char entrada[100];
         scanf ("%s", entrada);
       
         for (int j=0;j<strlen(palavras);j++){

             int iguais=0;

            for (int k=0;k<strlen(entrada);k++){

                if (strlen(entrada)== strlen(palavras[j])){
                if (palavras[j][k]== entrada[k] ){

                    iguais++;
                }
            }
            }

            if (iguais== strlen(entrada)-1){

                printf ("%s\n",palavras[j]);
                break;
            }
         }
         
    }

    return 0;
}