import java.util.Scanner;
import java.util.ArrayList;

public class hallOfMurders{

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int n=6;

        ArrayList <String> assasinos= new ArrayList<>();
        ArrayList <String> assasinados= new ArrayList<>();

        for (int i=0; i < n; i++){

            String entrada= scanner.nextLine();

            String partes[]= entrada.split(" ");

            assasinos.add(partes[0]);
            assasinados.add(partes[1]);

        }

        ArrayList<String> assasinosUnicos= new ArrayList<>();
        ArrayList<String> assasinosVivos= new ArrayList<>();
        // Adicionando assassinos vivos à lista assasinosVivos
        for (int i = 0; i < assasinos.size(); i++) {
            String assassino = assasinos.get(i);
            if (!assasinados.contains(assassino)) {
                assasinosVivos.add(assassino);
            }
        }

        for (int y=0;y<assasinosVivos.size(); y++){

            boolean unico=true;

            for (int z=y+1; z<assasinosVivos.size();z++){

                if (assasinosVivos.get(y).equals(assasinosVivos.get(z))){

                    unico=false;
                }
            }

            if(unico){

                assasinosUnicos.add(assasinosVivos.get(y));
            }
        }

        // Contagem correta de assassinatos
        int numAssassinatos[] = new int[assasinosUnicos.size()];

        for (int l=0; l < assasinosUnicos.size(); l++) {
            String assassino = assasinosUnicos.get(l);
            for (int m=0; m < assasinos.size(); m++) {
                if (assassino.equals(assasinos.get(m))) {
                    numAssassinatos[l]++;
                }
            }
        }

        SelectionSort(assasinosUnicos, numAssassinatos);
        // Exibindo assassinos únicos e suas contagens de assassinato
        for (int z=0; z < assasinosUnicos.size(); z++){
            System.out.println (assasinosUnicos.get(z) + " " + numAssassinatos[z]);
        }  
    }

    public static void SelectionSort(ArrayList<String> vetor, int[] numAssassinatos) {
        int tamanhoVetor = vetor.size();
    
        for (int i = 0; i < tamanhoVetor - 1; i++) {
            int minIndex = i;
    
            for (int j = i + 1; j < tamanhoVetor; j++) {
                // Comparação de strings usando compareToIgnoreCase para ignorar maiúsculas e minúsculas
                if (vetor.get(j).compareToIgnoreCase(vetor.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
    
            // Troca de elementos
            String temp = vetor.get(minIndex);
            vetor.set(minIndex, vetor.get(i));
            vetor.set(i, temp);
    
            int tempAssassinatos = numAssassinatos[minIndex];
            numAssassinatos[minIndex] = numAssassinatos[i];
            numAssassinatos[i] = tempAssassinatos;
        }
    }
    
}
