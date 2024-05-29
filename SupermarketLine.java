import java.util.PriorityQueue;
import java.util.Scanner;

class Cashier implements Comparable<Cashier> {
    int id;
    int processTime;
    int finishTime;

    public Cashier(int id, int processTime) {
        this.id = id;
        this.processTime = processTime;
        this.finishTime = 0;
    }

    @Override
    public int compareTo(Cashier other) {
        if (this.finishTime != other.finishTime) {
            return Integer.compare(this.finishTime, other.finishTime);
        }
        return Integer.compare(this.id, other.id);
    }
}

public class SupermarketLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of cashiers
        int M = sc.nextInt(); // number of clients

        PriorityQueue<Cashier> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int processTime = sc.nextInt();
            pq.add(new Cashier(i + 1, processTime));
        }

        for (int j = 0; j < M; j++) {
            int items = sc.nextInt();
            Cashier cashier = pq.poll();
            cashier.finishTime += items * cashier.processTime;
            pq.add(cashier);
        }

        int maxFinishTime = 0;
        while (!pq.isEmpty()) {
            Cashier cashier = pq.poll();
            maxFinishTime = Math.max(maxFinishTime, cashier.finishTime);
        }

        System.out.println(maxFinishTime);
        sc.close();
    }
}
     