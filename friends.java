import java.util.Scanner;

public class friends{


    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        String entrada= scanner.nextLine();
        String partesEntrada[] = entrada.split(" ");
        String amigosAdicionados= scanner.nextLine();
        String partesAmigos[] = amigosAdicionados.split(" ");
        String adicionarAntesDe= scanner.nextLine();

        StringBuilder str= new StringBuilder();

        int index=-1;
        for (int i=0;i<partesEntrada.length;i++){

            if(adicionarAntesDe.equals(partesEntrada[i])){

                index=i;
            }

        }

        if (index!= -1){


            for (int j=0;j<index;j++){

                str.append(partesEntrada[j]).append(" ");
            }

            for (int k=0; k<partesAmigos.length;k++){

                str.append(partesAmigos[k]).append(" ");
            }

            for (int l=index; l<partesEntrada.length;l++){

                str.append(partesEntrada[l]).append(" ");
            }

        } else{

            for (int j=0;j< partesEntrada.length;j++){

                str.append(partesEntrada[j]).append(" ");
            }

            for (int k=0;k< partesAmigos.length;k++){

                str.append(partesAmigos[k]).append(" ");
            }

        }

        System.out.println (str);
    }
}