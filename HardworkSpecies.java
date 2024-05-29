import java.util.ArrayList;
import java.util.Scanner;

public class HardworkSpecies{

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);


        int n= scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> todosPokemons= new ArrayList();
        ArrayList<String> PokemonsUnicos= new ArrayList();

        for (int i=0;i<n;i++){

            String pokemons= scanner.nextLine();

            todosPokemons.add(pokemons);
        }

        for (int j=0;j<n;j++){

            boolean unico= true;
            for (int k=j+1; k<n;k++){

                if (todosPokemons.get(k).equals(todosPokemons.get(j))){

                    unico=false;
                    break;
                }
            }

            if (unico){

                PokemonsUnicos.add(todosPokemons.get(j));
            }
        }

        
        double PorcentagemPokemons[]= new double[PokemonsUnicos.size()];

        for(int m=0;m<PokemonsUnicos.size(); m++){

           int quantidade=0;
            for (int p=0;p<todosPokemons.size();p++){

                if (PokemonsUnicos.get(m).equals(todosPokemons.get(p))){

                    quantidade++;
                }
            }

            double porcentagem= (double)quantidade/todosPokemons.size();
            PorcentagemPokemons[m]= porcentagem;
        }

        SelectionSort(PokemonsUnicos, PorcentagemPokemons);
        for (int z=0; z< PokemonsUnicos.size();z++){

            System.out.printf("%s %.2f%%\n", PokemonsUnicos.get(z), PorcentagemPokemons[z] * 100);

        }
    }
    public static void SelectionSort(ArrayList<String> vetor, double[] porcentagens){
        int tamanhoVetor = vetor.size();
    
        for (int i = 0; i < tamanhoVetor - 1; i++){
            int minIndex = i;
    
            for (int j = i + 1; j < tamanhoVetor; j++){
                if (vetor.get(j).compareTo(vetor.get(minIndex)) < 0){
                    minIndex = j;
                }
            }
    
            String temp = vetor.get(minIndex);
            vetor.set(minIndex, vetor.get(i));
            vetor.set(i, temp);
    
            double tempPorcentagem = porcentagens[minIndex];
            porcentagens[minIndex] = porcentagens[i];
            porcentagens[i] = tempPorcentagem;
        }
    }
}