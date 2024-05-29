import java.util.Scanner;

/**
 * help
 */
public class help {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        char[] indice= new char[n];
        int[] valores= new int[n];
        String[] correct= new String[n];

        for (int i=0;i<n;i++){

            String entrada= scanner.nextLine();

            String[] partes= entrada.split(" ");

            indice[i]= partes[0].charAt(0);
            valores[i]= Integer.parseInt(partes[1]);
            correct[i]= partes[2];
        }

        int soma=0;
        for (int i=0;i<n;i++){

            if (correct[i].equals("correct")){

                soma+=valores[i];

                if (i>0 && indice[i]== indice[i-1]){

                    soma+=20;
                }
            }
        }

        System.out.println(soma);
    }
}