        import java.util.*;

        public class gnomesteams {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                scanner.nextLine(); // Consumir nova linha
                String nomes[] = new String[n];
                int idades[] = new int[n];

                for (int i = 0; i < n; i++) {
                    String entrada = scanner.nextLine();
                    String[] partes = entrada.split(" ");
                    nomes[i] = partes[0];
                    idades[i] = Integer.parseInt(partes[1]);
                }

                OrdenarGnomos(n, nomes, idades);

                int numTimes = n / 3;

                for (int i = 0; i < numTimes; i++) { // Loop para alternar entre os times
                    System.out.println("Time: " + (i + 1));
                    for (int j = 0; j < numTimes; j++) {
                        int index = i + j * 3;
                        if (index < n) {
                            System.out.println(nomes[index] + " " + idades[index]);
                        }
                    }       
            }
        }

            public static void OrdenarGnomos(int n, String[] nomes, int[] idades) {
                for (int i = 0; i < n - 1; i++) {
                    int indiceMenor = i;
                    for (int j = i + 1; j < n; j++) {
                        if (idades[j] < idades[indiceMenor]) {
                            indiceMenor = j;
                        }
                    }
                    // Trocar os valores de nomes
                    String tempNome = nomes[indiceMenor];
                    nomes[indiceMenor] = nomes[i];
                    nomes[i] = tempNome;

                    // Trocar os valores de idades
                    int tempIdade = idades[indiceMenor];
                    idades[indiceMenor] = idades[i];
                    idades[i] = tempIdade;
                }
            }
        }
