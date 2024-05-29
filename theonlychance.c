#include <stdio.h>
#include <string.h>

int main(){

    int n;
    scanf ("%d", &n);

    for (int test_case = 0; test_case < n; test_case++) {
        int quantidadeLetras;
        scanf ("%d", &quantidadeLetras);

        char vetorCaracteres[quantidadeLetras];
        for (int i = 0; i < quantidadeLetras; i++){
            scanf (" %c", &vetorCaracteres[i]); // Adicionado um espaço antes de %c para ignorar espaços em branco e quebras de linha
        }

        int swaps = 0;

        // Selection Sort
        for (int i = 0; i < quantidadeLetras - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < quantidadeLetras; j++) {
                if (vetorCaracteres[j] < vetorCaracteres[min_index]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                char temp = vetorCaracteres[i];
                vetorCaracteres[i] = vetorCaracteres[min_index];
                vetorCaracteres[min_index] = temp;
                swaps++;
            }
        }

        if (swaps >1){
            printf ("There arent chance");
        } else{
            printf ("There are the chance");
        }
    }
    
    return 0;
}
