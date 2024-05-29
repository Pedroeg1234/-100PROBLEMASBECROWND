#include <stdio.h>
#include <string.h>

int main(){

    char entrada[1000]; 

    scanf (" %[^\n]", entrada);

    char stringResp[2000];
    int contador=0;
    int aberto=1;

    for (int i=0;i<strlen(entrada);i++){

        if (entrada[i]== '_' && aberto== 1){

            stringResp[contador++]= '<';
            stringResp[contador++]= 'i';
            stringResp[contador++]= '>';

            aberto=0;

        } else if (entrada[i] == '_' && aberto==0){

            stringResp[contador++]= '<';
            stringResp[contador++]= '/';
            stringResp[contador++]= 'i';
            stringResp[contador++]= '>';

            aberto=1;
        }   else if (entrada[i] == '*' && aberto==1){

            stringResp[contador++]= '<';
            stringResp[contador++]= 'b';
            stringResp[contador++]= '>';

            aberto=0;
        }   else if (entrada[i] == '*' && aberto==0){

            stringResp[contador++]= '<';
            stringResp[contador++]= '/';
            stringResp[contador++]= 'b';
            stringResp[contador++]= '>';

            aberto=1;
        } else{

            stringResp[contador++]= entrada[i];
        }
    }

    return 0;
}