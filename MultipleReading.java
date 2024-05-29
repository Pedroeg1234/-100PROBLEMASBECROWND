
/* 
Isso ocorre porque temos quatro operações de leitura, e podemos processar todas elas simultaneamente,
 já que temos oito processos disponíveis. Portanto, apenas um ciclo de clock é necessário para executar
  todas as operações de leitura. 
*/
import java.util.Scanner;

public class MultipleReading{


    public static void main(String[] args){

        Scanner scanner= new Scanner (System.in);

        String entrada=scanner.nextLine();
        int qntdLeitura= scanner.nextInt();
        int quantidadeClocks=0;
        int quantidadeLeitura=0;
        for (int i=0;i<entrada.length();i++){

            if (entrada.charAt(i)=='W'){

                quantidadeClocks++;
            }

            if (entrada.charAt(i)=='R'){

                quantidadeLeitura++;
            }
        }

        int aux= quantidadeLeitura/qntdLeitura;

        if (quantidadeLeitura % qntdLeitura != 0) {
            aux++;
        }

        quantidadeClocks+= aux;

        
        System.out.println(quantidadeClocks);

        scanner.close();
    }

}