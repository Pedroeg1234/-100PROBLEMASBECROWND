/**
 * ChristimansOlympics
 */

 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Comparator;
 import java.util.Collections;


 class PaisMedalhas implements Comparable <PaisMedalhas>{

    String nome;
    int[] medalhas;

    public PaisMedalhas(String nome){

        this.nome=nome;
        this.medalhas= new int[3];

    }

    public void AddOuro(){

        medalhas[0]++;
    }

    public void AddPrata(){

        medalhas[1]++;
    }

    public void AddBronze(){

        medalhas[2]++;
    }

    public int[] getMedals(){

        return medalhas;
    }

    @Override
    public int compareTo(PaisMedalhas outroPais){

        if (outroPais.medalhas[0] != this.medalhas[0]){

            return Integer.compare(outroPais.medalhas[0], this.medalhas[0]);

        }

         else if (outroPais.medalhas[1] != this.medalhas[1]){

            return Integer.compare(outroPais.medalhas[1], this.medalhas[1]);
        }

        return Integer.compare(outroPais.medalhas[2], this.medalhas[2]);
    }

     @Override
    public String toString() {
       
        return nome + " " +  getMedals();
    }
 }

    public class ChristimansOlympics {

    
        /**
         * @param args
         */
        public static void main(String[] args) {
            
            Scanner scanner= new Scanner(System.in);
            ArrayList<PaisMedalhas> medalhas = new ArrayList<>();
          
            for (int i=0;i<5;i++){

                String modalidade= scanner.nextLine();
                String ouro= scanner.nextLine();
                String prata= scanner.nextLine();
                String bronze= scanner.nextLine();

                EncontrarPais(medalhas, ouro, prata, bronze);
            }

            Collections.sort(medalhas);

            System.out.println("Quadro de Medalhas");
            for (int j = 0; j < medalhas.size(); j++) {
                PaisMedalhas pais = medalhas.get(j);
                System.out.println(pais.nome + " " + pais.getMedals()[0] + " " + pais.getMedals()[1] + " " + pais.getMedals()[2]);
            }
            
        }

        public static void EncontrarPais( ArrayList<PaisMedalhas> medalhas, String ouro, String prata, String bronze){

            PaisMedalhas GoldCountry = EncontreOuCriePais(medalhas, ouro);
            PaisMedalhas SilverCountry= EncontreOuCriePais(medalhas, prata);
            PaisMedalhas BronzeCountry= EncontreOuCriePais(medalhas, bronze);

            GoldCountry.AddOuro();
            SilverCountry.AddPrata();
            BronzeCountry.AddBronze();

            
        }
        
        public static PaisMedalhas EncontreOuCriePais(ArrayList<PaisMedalhas> medalhas, String nomePais){

            for (int i=0;i< medalhas.size(); i++){

                PaisMedalhas pais= medalhas.get(i);

                if (pais.nome.equals(nomePais)){

                    return pais;
                }

            }

            PaisMedalhas NovoPais= new PaisMedalhas(nomePais);
            medalhas.add(NovoPais);
            return NovoPais;
        }
    }
