import java.util.Scanner;

public class justifier {
    

    //PEGA O TAMANHO DO MAIOR--- FAZ O MAIOR MENOS A POSICAO ATUAL E COLOCA VAZIO DEPOIS JUNTA AS STRINGS
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        int qntd= scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String entradas[]= new String[qntd];

        for (int i=0;i<qntd;i++){

            entradas[i]= scanner.nextLine();
        }

        String maior="";
        for (int j=0;j<entradas.length;j++){

            if (entradas[j].length() > maior.length()){

                maior=entradas[j];
            }
        }

        int maiorElemento= maior.length();

        for (int j=0;j<entradas.length;j++){

            StringBuilder str= new StringBuilder();

            for (int i=0;i< maiorElemento- entradas[j].length();i++){

                str.append(" ");
            }

            System.out.println(str.toString() + entradas[j]);
        }
    }
}
