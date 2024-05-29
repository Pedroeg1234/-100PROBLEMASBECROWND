import java.util.*;

public class FlyingControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> eastQueue = new PriorityQueue<>();
        Queue<String> northQueue = new LinkedList<>();
        Queue<String> southQueue = new LinkedList<>();

        int cardinalPoint;
        while ((cardinalPoint = scanner.nextInt()) != 0) {

            scanner.nextLine();
            String line;
            while (!(line = scanner.nextLine()).isEmpty()) {
                switch (cardinalPoint) {
                    case -1:
                        eastQueue.offer(line);
                        break;
                    case -2:
                        northQueue.offer(line);
                        break;
                    case -3:
                        southQueue.offer(line);
                        break;
                }
            }
        }

        while (!eastQueue.isEmpty() || !northQueue.isEmpty() || !southQueue.isEmpty()) {
            if (!eastQueue.isEmpty()) {
                System.out.print(eastQueue.poll() + " ");
            }
            if (!northQueue.isEmpty()) {
                System.out.print(northQueue.poll() + " ");
            }
            if (!southQueue.isEmpty()) {
                System.out.print(southQueue.poll() + " ");
            }
        }
    }
}
