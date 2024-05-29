import java.util.*;

class Jogador {
    String nome;
    int habilidade;

    public Jogador(String nome, int habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }
}

public class times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.nextLine();

        List<Jogador> jogadores = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String nome = scanner.next();
            int habilidade = scanner.nextInt();
            jogadores.add(new Jogador(nome, habilidade));
        }

        Collections.sort(jogadores, (a, b) -> b.habilidade - a.habilidade);

        List<List<Jogador>> times = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            times.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            times.get(i % T).add(jogadores.get(i));
        }

        for (List<Jogador> time : times) {
            Collections.sort(time, (a, b) -> a.nome.compareTo(b.nome));
        }

        for (int i = 0; i < T; i++) {
            System.out.println("Time " + (i + 1));
            for (Jogador jogador : times.get(i)) {
                System.out.println(jogador.nome);
            }
            System.out.println();
        }

        scanner.close();
    }
}
