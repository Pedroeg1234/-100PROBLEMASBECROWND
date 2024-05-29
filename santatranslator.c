#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>


typedef struct{

  char paises[50];
  char traducoes[50];
} Tradutor;


int main (){

  Tradutor translate[] = {

  {"brasil", "Feliz Natal!"},
  {"alemanha", "Frohliche Weihnachten!"},
  {"austria", "Frohe Weihnacht!"},
  {"coreia", "Chuk Sung Tan!"},
  {"espanha", "Feliz Navidad!"},
  {"grecia", "Kala Christougena!"},
  {"estados-unidos", "Merry Christmas!"},
  {"inglaterra", "Merry Christmas!"},
  {"australia", "Merry Christmas!"},
  {"portugal", "Feliz Natal!"},
  {"suecia", "God Jul!"},
  {"turquia", "Mutlu Noeller"},
  {"argentina", "Feliz Navidad!"},
  {"chile", "Feliz Navidad!"},
  {"mexico", "Feliz Navidad!"},
  {"antardida", "Merry Christmas!"},
  {"canada", "Merry Christmas!"},
  {"irlanda", "Nollaig Shona Dhuit!"},
  {"belgica", "Zalig Kerstfeest!"},
  {"italia", "Buon Natale!"},
  {"libia", "Buon Natale!"},
  {"siria", "Milad Mubarak!"},
  {"marrocos", "Milad Mubarak!"},
  {"japao", "Merii Kurisumasu!"}
};

  int tam= sizeof(translate) / sizeof(translate[0]);

  
  
  while (1){


    char entrada[200];
    if (scanf("%s", entrada) == EOF){
      
        break;
    }
    
    bool achou=false;
    
    for (int i=0;i<tam;i++){

      if(strcmp(translate[i].paises, entrada) ==0 ){

       printf ("%s\n", translate[i].traducoes);
        achou=true;
        break;
      }
    }

    if(!achou){
      printf ("--- NOT FOUND ---\n");
    }
  }
  return 0;
}