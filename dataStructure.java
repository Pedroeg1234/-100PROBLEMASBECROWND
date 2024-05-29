import java.util.*;

public class dataStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            boolean ehFila = true, ehPilha = true, ehPQ = true;

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            Queue<Integer> fila = new LinkedList<>();
            Stack<Integer> pilha = new Stack<>();

            for (int i = 0; i < N; i++) {
                int acao = scanner.nextInt();
                int X = scanner.nextInt();

                if (acao == 1) {
                    fila.add(X);
                    pilha.push(X);
                    pq.add(X);
                } else if (acao == 2) {
                    if (!pilha.isEmpty() && pilha.peek() == X) {
                        pilha.pop();
                    } else {
                        ehPilha = false;
                    }

                    if (!fila.isEmpty() && fila.peek() == X) {
                        fila.poll();
                    } else {
                        ehFila = false;
                    }

                    if (!pq.isEmpty() && pq.peek() == X) {
                        pq.poll();
                    } else {
                        ehPQ = false;
                    }
                }
            }

            if (!ehPilha && !ehFila && !ehPQ) {
                System.out.println("impossible");
            } else if (ehPilha && ehPQ) {
                System.out.println("not sure");
            } else if (ehPilha && ehFila) {
                System.out.println("not sure");
            } else if (ehPQ && ehFila) {
                System.out.println("not sure");
            } else if (ehPQ) {
                System.out.println("priority queue");
            } else if (ehFila) {
                System.out.println("queue");
            } else if (ehPilha) {
                System.out.println("stack");
            }
        }
    }
}