import java.util.Scanner;
import java.util.Stack;

public class trails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            while (true) {
                int[] vetor = new int[n];
                vetor[0] = scanner.nextInt();
                if (vetor[0] == 0) break;

                for (int i = 1; i < n; i++) {
                    vetor[i] = scanner.nextInt();
                }

                Stack<Integer> pilha = new Stack<>();
                int atual = 0;

                for (int i = 1; i <= n; i++) {
                    pilha.push(i);

                    while (!pilha.isEmpty() && pilha.peek() == vetor[atual]) {
                        atual++;
                        pilha.pop();
                    }
                }

                System.out.println(pilha.isEmpty() ? "Yes" : "No");
            }

            System.out.println();
        }

        scanner.close();
    }
}
