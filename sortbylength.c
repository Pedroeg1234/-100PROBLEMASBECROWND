#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void selectionSort(char palavras[][30], int n) {
    int i, j;
    char temp[30];

    for (i = 0; i < n - 1; i++) {
        for (j = i + 1; j < n; j++) {
            if (strlen(palavras[j]) < strlen(palavras[i])) {
                strcpy(temp, palavras[i]);
                strcpy(palavras[i], palavras[j]);
                strcpy(palavras[j], temp);
            }
        }
    }
}

int main() {
    int n;
    scanf("%d", &n);

    char frase[1000];
    char palavras[50][30]; // Alocando a matriz de palavras com o tamanho correto
    int contadorPalavra = 0; // Inicializando o contador de palavras como 0
    int contadorLetras = 0;

    for (int i = 0; i < n; i++) {
        scanf(" %[^\n]", frase);
        contadorLetras = 0;
        for (int j = 0; j < strlen(frase); j++) {
            if (frase[j] != ' ') {
                palavras[contadorPalavra][contadorLetras++] = frase[j];
            } else {
                palavras[contadorPalavra][contadorLetras] = '\0'; // Adicionando terminador de string
                contadorPalavra++;
                contadorLetras = 0;
            }
        }
        palavras[contadorPalavra][contadorLetras] = '\0'; // Adicionando terminador de string para a última palavra
        contadorPalavra++;
        selectionSort(palavras, contadorPalavra);

        for (int k = 0; k < contadorPalavra; k++) {
            printf("%s ", palavras[k]); // Alterei para imprimir com um espaço entre as palavras
        }

        printf("\n"); // Adicionei uma quebra de linha aqui

        contadorPalavra = 0; // Resetando o contador de palavras
    }

    return 0;
}
