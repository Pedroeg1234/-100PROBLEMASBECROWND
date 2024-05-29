import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class throwingcards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0)
                break;

            Queue<Integer> deck = new LinkedList<>();
            for (int i = 1; i <= n; i++)
                deck.offer(i);

            ArrayList<Integer> discardedCards = new ArrayList<>();
            while (deck.size() >= 2) {
                discardedCards.add(deck.poll());
                deck.offer(deck.poll());
            }

            System.out.print("Discarded cards: ");
            for (int i = 0; i < discardedCards.size(); i++) {
                System.out.print(discardedCards.get(i));
                if (i < discardedCards.size() - 1)
                    System.out.print(", ");
            }
            System.out.println();
            System.out.println("Remaining card: " + deck.peek());
        }

        scanner.close();
    }
}
