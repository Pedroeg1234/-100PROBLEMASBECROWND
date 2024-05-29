import java.util.Scanner;

public class onetwothree{

//OBJETIVO: COMPARAR A STRING ATUAL COM TODAS  AS STRINGS DENTRO DO VETOR WORDS.
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();

        String[] words = {"one", "two", "three"};

        for (int i=0;i<n;i++){

            String entrada=scanner.nextLine();

            for (int j=0;j<words.length;j++){
                int iguais=0;
                String palavraAtual= words[j];
            
                for (int k=0;k<palavraAtual.length();k++){

                    if (entrada.length()!=palavraAtual.length()){

                        break;
                    }
                    if (palavraAtual.charAt(k)==entrada.charAt(k)){
                        iguais++;
                    }
                }

                if(iguais==entrada.length()-1){
                    System.out.println (palavraAtual);
                }
        }
    }
}
}