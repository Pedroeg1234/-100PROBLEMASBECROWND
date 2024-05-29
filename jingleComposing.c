#include <stdio.h>
#include <string.h>

double calcularJingle(char letratual) {
    switch (letratual) {
        case 'W':
            return 1.0;
        case 'H':
            return 0.5;
        case 'Q':
            return 0.25;
        case 'E':
            return 0.125;
        case 'S':
            return 0.0625;
        case 'T':
            return 0.03125;
        case 'X':
            return 0.015625;
        default:
            return 0;
    }
}

int main() {
    while (1) {
        char entrada[500];
        scanf(" %[^\n]", entrada);

        int soma = 0;
        int quantidade = 0;

        for (int i = 0; i < strlen(entrada); i++) {
            if (entrada[i] == '/') {
                if (soma == 1.0) {
                    quantidade++;
                }
                soma = 0;
            } else {
                char caractereAtual = entrada[i];
                soma += calcularJingle(caractereAtual);
            }
        }

       
        printf("%d\n", quantidade);
    }

    return 0;
}
