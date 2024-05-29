/**
 * godofor
 */

 import java.util.*;

 class Personagens implements Comparable<Personagens>{

    String nome;
    int poder;
    int godsKilled;
    int vezesMorto;

    public Personagens(String nome, int poder, int godsKilled, int vezesMorto){

        this.nome=nome;
        this.poder=poder;
        this.godsKilled= godsKilled;
        this.vezesMorto= vezesMorto;


    }

    @Override
    public int compareTo(Personagens outroPersonagem){

        if (this.poder != outroPersonagem.poder){

            return Integer.compare(this.poder, outroPersonagem.poder);
        }

        if (this.godsKilled != outroPersonagem.godsKilled){

            return Integer.compare(this.godsKilled, outroPersonagem.godsKilled);

        }

        if (this.vezesMorto != outroPersonagem.vezesMorto){

            return Integer.compare(this.vezesMorto, outroPersonagem.vezesMorto);
        }

        int  NomesIguais= this.nome.compareTo(outroPersonagem.nome);
        return NomesIguais;

    }

    @Override 
    public String toString(){

        return nome + " " + poder + " " + godsKilled + " " + vezesMorto + " ";
    }

 }
public class godofor {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n=scanner.nextInt();
        scanner.nextLine();
        ArrayList<Personagens> personagens= new ArrayList<>();
        for (int i=0;i<n;i++){

            String entrada= scanner.nextLine();
            String partes[] = entrada.split(" ");

            String nome= partes[0];
            int poder= Integer.parseInt(partes[1]);
            int godsKilled= Integer.parseInt(partes[2]);
            int vezesMorto= Integer.parseInt(partes[3]);

            personagens.add(new Personagens(nome,poder, godsKilled, vezesMorto));
        }

        Collections.sort(personagens);

        for (int i=0;i<1; i++){

            System.out.println(personagens.get(i).nome);
        }
    }


}