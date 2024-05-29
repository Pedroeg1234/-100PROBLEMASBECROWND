#include <stdio.h>
#include <string.h>

int main() {
    int n;

    scanf("%d", &n);

    // Definindo o tamanho máximo para a entrada
    char entradas[n][100];

    for (int i = 0; i < n; i++) {
        scanf("%s", entradas[i]);
    }

    int maior = 0;

    for (int i = 0; i < n; i++) {
        if (strlen(entradas[i]) > maior) {
            maior = strlen(entradas[i]);
        }
    }

    for (int i = 0; i < n; i++) {
        int contador = 0;
        char juntador[500] = ""; // Inicializando a string juntador

        // Adicionando espaços iniciais para alinhar corretamente as entradas
        for (int j = 0; j < maior - strlen(entradas[i]); j++) {
            juntador[contador++] = ' ';
        }

        // Concatenando a entrada atual com a string juntador
        strcat(juntador, entradas[i]);

        printf("%s\n", juntador);
    }

    return 0;
}
