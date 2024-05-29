#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_EXPR_LENGTH 1000

int precedence(char op) {
    switch (op) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
        default:
            return 0;
    }
}

int is_operator(char ch) {
    return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
}

void infix_to_postfix(char *infix, char *postfix) {
    char stack[MAX_EXPR_LENGTH];
    int top = -1;
    int k = 0;

    for (int i = 0; infix[i] != '\0'; i++) {
        if ((infix[i] >= 'a' && infix[i] <= 'z') || (infix[i] >= 'A' && infix[i] <= 'Z') || (infix[i] >= '0' && infix[i] <= '9')) {
            postfix[k++] = infix[i];
        } else if (infix[i] == '(') {
            stack[++top] = infix[i];
        } else if (infix[i] == ')') {
            while (top != -1 && stack[top] != '(') {
                postfix[k++] = stack[top--];
            }
            top--; // remove '(' from stack
        } else if (is_operator(infix[i])) {
            while (top != -1 && precedence(stack[top]) >= precedence(infix[i])) {
                postfix[k++] = stack[top--];
            }
            stack[++top] = infix[i];
        }
    }

    while (top != -1) {
        postfix[k++] = stack[top--];
    }
    postfix[k] = '\0';
}

int main() {
    int N;
    char infix[MAX_EXPR_LENGTH];
    char postfix[MAX_EXPR_LENGTH];

    scanf("%d", &N);
    getchar(); // consume newline

    for (int i = 0; i < N; i++) {
        fgets(infix, MAX_EXPR_LENGTH, stdin);
        infix_to_postfix(infix, postfix);
        printf("%s\n", postfix);
    }

    return 0;
}
