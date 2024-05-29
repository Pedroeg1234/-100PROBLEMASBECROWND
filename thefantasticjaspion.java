/**
 * thefantasticjaspion
 */

 import java.util.Scanner;
public class thefantasticjaspion {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            String quantidades = scanner.nextLine();
            String corteQuantidades[]= quantidades.split(" ");

            int dicionario= Integer.parseInt(corteQuantidades[0]);
            int saidas = Integer.parseInt(corteQuantidades[1]);

            String arrayPalavras[]= new String [dicionario];
            String arrayTraducoes[]= new String [dicionario];
            for (int j=0; j<dicionario; j++){

                arrayPalavras[j] = scanner.nextLine();
                arrayTraducoes[j] = scanner.nextLine();
            }

            for (int k=0; k< saidas; k++){

                StringBuilder str = new StringBuilder();
                String entrada= scanner.nextLine();

                String parteEntrada[] = entrada.split(" ");

                for (int l=0;l<parteEntrada.length;l++){
                    boolean achou=false;
                    for (int m=0;m<arrayPalavras.length;m++){
                        
                        if (arrayPalavras[m].equals(parteEntrada[l])){

                            str.append(arrayTraducoes[m]);
                            achou=true;
                        }
                    }

                    if(!achou){

                        str.append(parteEntrada[l]);
                    }

                }

                System.out.println(str);
            }

        }
    }
}