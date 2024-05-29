import java.util.*;

class Country implements Comparable<Country> {
    String name;
    int gold;
    int silver;
    int bronze;

    public Country(String name, int gold, int silver, int bronze) {
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    @Override
    public int compareTo(Country other) {
        // Comparação por medalhas de ouro
        if (this.gold != other.gold) {
            return other.gold - this.gold;
        }
        
        // Comparação por medalhas de prata
        if (this.silver != other.silver) {
            return other.silver - this.silver;
        }
        
        // Comparação por medalhas de bronze
        if (this.bronze != other.bronze) {
            return other.bronze - this.bronze;
        }

        // Se houver empate em todas as medalhas, ordena alfabeticamente
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " " + gold + " " + silver + " " + bronze;
    }
}

public class MedalTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCountries = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número de países

        List<Country> countries = new ArrayList<>();
        for (int i = 0; i < numCountries; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            int gold = Integer.parseInt(parts[1]);
            int silver = Integer.parseInt(parts[2]);
            int bronze = Integer.parseInt(parts[3]);
            countries.add(new Country(name, gold, silver, bronze));
        }

        // Ordenar a lista de países
        Collections.sort(countries);

        // Imprimir o quadro de medalhas ordenado
        for (Country country : countries) {
            System.out.println(country);
        }

        scanner.close();
    }
}
