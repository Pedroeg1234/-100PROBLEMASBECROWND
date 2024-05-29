import java.util.PriorityQueue;
import java.util.Scanner;

class Carro {
    int inicio;
    int saida;
    
    public Carro(int i, int s) {
        this.inicio = i;
        this.saida = s;
    }
}

public class LinearParkLot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, k;

        while (true) {
            n = sc.nextInt();
            k = sc.nextInt();
            if (n == 0 && k == 0) break;

            Carro[] vet = new Carro[n];
            for (int i = 0; i < n; i++) {
                int c = sc.nextInt();
                int s = sc.nextInt();
                vet[i] = new Carro(c, s);
            }

            boolean possivel = true;
            PriorityQueue<Carro> estacionamento = new PriorityQueue<>((a, b) -> a.saida - b.saida);

            for (int i = 0; i < n; i++) {
                Carro carroAtual = vet[i];
                
                if(vet[i].saida>10) {
                	possivel =false;
                	break;
                }
                
                // Remove os carros que já podem sair antes de tentar estacionar o próximo carro
                while (!estacionamento.isEmpty() && estacionamento.peek().saida <= carroAtual.inicio) {
                    estacionamento.poll();
                }

                // Verifica se ainda há espaço no estacionamento
                if (estacionamento.size() < k) {
                    estacionamento.offer(carroAtual);
                } else {
                    possivel = false;
                    break;
                }
            }

            if (possivel) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
        }
    }
}
