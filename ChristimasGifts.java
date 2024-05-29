import java.util.*;

class Gift implements Comparable<Gift> {
    String name;
    double cost;
    int preference;

    public Gift(String name, double cost, int preference) {
        this.name = name;
        this.cost = cost;
        this.preference = preference;
    }

    @Override
    public int compareTo(Gift other) {
        if (this.preference != other.preference)
            return other.preference - this.preference;
        if (this.cost != other.cost)
            return Double.compare(this.cost, other.cost);
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("%s - R$%.2f", name, cost);
    }
}

public class ChristimasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int t = 0; t < 2; t++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String ownerName = parts[0];
            int Q = Integer.parseInt(parts[1]);

            List<Gift> gifts = new ArrayList<>();
            for (int i = 0; i < Q; i++) {
                String giftName = scanner.nextLine();
                String entrada= scanner.nextLine();
                String partes[]= entrada.split(" ");
                double cost = Double.parseDouble(partes[0]);
                int preference = Integer.parseInt(partes[1]);
                gifts.add(new Gift(giftName, cost, preference));
            }

            Collections.sort(gifts);

            System.out.println("Lista de " + ownerName);
            for (Gift gift : gifts) {
                System.out.println(gift);
            }
            System.out.println();
        }

        scanner.close();
    }
}
