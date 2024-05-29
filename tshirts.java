import java.util.*;

class Camisa implements Comparable<Camisa> {
    String nome;
    String cor;
    String tamanho;

    public Camisa(String nome, String cor, String tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public int compareTo(Camisa outra) {
      
        int cmp = this.cor.compareTo(outra.cor);
        if (cmp != 0) {
            return cmp;
        }
    
       
        cmp = outra.tamanho.compareTo(this.tamanho);
        if (cmp != 0) {
            return cmp;
        }

  //
        return this.nome.compareTo(outra.nome);
    }

    @Override
    public String toString() {
        return cor + " " + tamanho + " " + nome;
    }
}

public class tshirts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            if (quantidade == 0) {
                break;
            }

            ArrayList<Camisa> camisas = new ArrayList<>();
            for (int i = 0; i < quantidade; i++) {
                String nome = scanner.nextLine();
                String camisa = scanner.nextLine();

                String partes[] = camisa.split(" ");
                String cores = partes[0];
                String tamanho = partes[1];

                camisas.add(new Camisa(nome, cores, tamanho));
            }

            Collections.sort(camisas);

            for (Camisa camisa : camisas) {
                System.out.println(camisa);
            }
        }
        scanner.close();
    }
}
