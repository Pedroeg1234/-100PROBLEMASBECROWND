import java.util.*;

class Rena {
    String nome;
    int peso;
    int idade;
    double altura;

    public Rena(String nome, int peso, int idade, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }
}

public class thedarkelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            scanner.nextLine();
            
            List<Rena> renas = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String[] infoRena = scanner.nextLine().split(" ");
                String nome = infoRena[0];
                int peso = Integer.parseInt(infoRena[1]);
                int idade = Integer.parseInt(infoRena[2]);
                double altura = Double.parseDouble(infoRena[3]);
                renas.add(new Rena(nome, peso, idade, altura));
            }

            Collections.sort(renas, new Comparator<Rena>() {
                @Override
                public int compare(Rena r1, Rena r2) {
                    if (r1.peso != r2.peso) {
                        return Integer.compare(r2.peso, r1.peso);
                    } else if (r1.idade != r2.idade) {
                        return Integer.compare(r1.idade, r2.idade);
                    } else if (r1.altura != r2.altura) {
                        return Double.compare(r1.altura, r2.altura);
                    } else {
                        return r1.nome.compareTo(r2.nome);
                    }
                }
            });

            System.out.println("CENÁRIO " + t);
            for (int i = 0; i < M; i++) {
                Rena rena = renas.get(i);
                System.out.println((i + 1) + " - " + rena.nome);
            }
        }
    }
}
