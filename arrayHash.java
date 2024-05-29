import java.util.Scanner;

public class arrayHash {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int qntdStrings = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        int somaPosicoesAlfabeto = 0;
        int somaPosicoesElemento = 0;
        int somaNumeroElemento = 0;
        
        for (int i = 0; i < qntdStrings; i++) {

            String entrada = scanner.nextLine();

            for (int j = 0; j < entrada.length(); j++) {
                char caractereAtual = entrada.charAt(j);
                if (caractereAtual >= 'A' && caractereAtual <= 'Z') {
                    // Maiúsculas
                    somaPosicoesAlfabeto += caractereAtual - 'A';
                } else if (caractereAtual >= 'a' && caractereAtual <= 'z') {
                    // Minúsculas
                    somaPosicoesAlfabeto += caractereAtual - 'a';
                }
                somaPosicoesElemento += j;
                somaNumeroElemento += i; // Corrigido para somar o número total de elementos
            }
          
        }
        

        int arrayHash = somaPosicoesAlfabeto + somaPosicoesElemento + somaNumeroElemento;
        System.out.println(arrayHash); // Imprimir o arrayHash
    }
}
