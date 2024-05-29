#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int *findWordPositions(char *text, char *word, int *count) {
    int *positions = NULL;
    int text_len = strlen(text);
    int word_len = strlen(word);
    int found = 0;
    
    positions = (int *)malloc(text_len * sizeof(int));
    if (positions == NULL) {
        fprintf(stderr, "Memory allocation failed!\n");
        exit(EXIT_FAILURE);
    }

    for (int i = 0; i <= text_len - word_len; i++) {
        if (strncmp(&text[i], word, word_len) == 0) {
            positions[*count] = i;
            (*count)++;
            found = 1;
        }
    }
    
    if (!found) {
        free(positions);
        positions = NULL;
        *count = 0;
    }

    return positions;
}

int main() {
    char text[1000];
    int M;
    
    while (fgets(text, sizeof(text), stdin) != NULL) {
        text[strcspn(text, "\n")] = '\0';
        
        scanf("%d", &M);
        getchar();
        
        char words[M][100];
        for (int i = 0; i < M; i++) {
            scanf("%s", words[i]);
        }
        getchar();
        
        for (int i = 0; i < M; i++) {
            int count = 0;
            int *positions = findWordPositions(text, words[i], &count);
            
            if (positions == NULL) {
                printf("-1\n");
            } else {
                for (int j = 0; j < count; j++) {
                    printf("%d ", positions[j]);
                }
                printf("\n");
                free(positions);
            }
        }
    }

    return 0;
}
