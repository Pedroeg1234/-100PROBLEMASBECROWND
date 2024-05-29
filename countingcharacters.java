import java.util.Scanner;

public class countingcharacters {

//SALVA AS PALAVRAS NUM VETOR E IMPRIME O TAMANHO DE CADA UMA DELAS. DEPOIS CRIE UMA VARIÁVEL GLOBAL PARA PEGAR A MAIOR PALAVRA
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String maiorPalavra = "";
        String frase = "";
        while (true) {
            frase = scanner.nextLine();
            if (frase.equals("0")) {
                break;
            }

            String partes[] = frase.split(" ");
            int tamanhoPartes = partes.length;
            StringBuilder resultado = new StringBuilder();
           

            for (int i = 0; i < tamanhoPartes; i++) {
                int VetorPartes[] = new int[tamanhoPartes];
                String parteAtual = partes[i];
                VetorPartes[i] = parteAtual.length();

                resultado.append(VetorPartes[i]);

                
                if (i != tamanhoPartes - 1) {
                    resultado.append("-");
                }

                if (parteAtual.length() > maiorPalavra.length()) {
                    maiorPalavra = parteAtual;
                }
            }

            System.out.println(resultado);
        }

        System.out.println(maiorPalavra);
    }
}
