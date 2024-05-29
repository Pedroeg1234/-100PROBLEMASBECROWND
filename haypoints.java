/**
 * haypoints
 */

 import java.util.Scanner;
public class haypoints {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        scanner.nextLine();
        int textos= scanner.nextInt();
        scanner.nextLine();

        String[] palavraComValores= new String[100];
        int contPalavras=0;
        double[] valores= new double[100];
        int contValores=0;

        for (int i=0;i<n;i++){

            String entrada= scanner.nextLine();

            String partes[]= entrada.split(" ");

                palavraComValores[contPalavras++]= partes[0];
                valores[contValores++]= Double.parseDouble(partes[1]);

        }

        for (int i=0;i<textos;i++){

            double VALORFINAL=0;

            String texto= scanner.nextLine();

            String partes2[]= texto.split(" ");

            for (int j=0;j<partes2.length;j++){

                String parteAtual= partes2[j];

                for (int k=0;k<palavraComValores.length;k++){

                    if (parteAtual.equals(palavraComValores[k])){

                        VALORFINAL+= valores[k];
                    }
                }
            }

            System.out.println(VALORFINAL);
        }

        
    }
}