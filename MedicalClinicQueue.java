/**
 * Filasus
 */

 import java.util.Scanner;
public class MedicalClinicQueue {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);


        int n= scanner.nextInt();
        scanner.nextLine();

        int vetHoras[] = new int[n];
        int vetminutos[] = new int[n];
        int vetTempoEspera[] = new int [n];
        for (int i=0;i<n;i++){

            String entrada= scanner.nextLine();

            String partes[]= entrada.split(" ");
            
            vetHoras[i] = Integer.parseInt(partes[0]);
            vetminutos[i] = Integer.parseInt(partes[1]);
            vetTempoEspera[i]= Integer.parseInt(partes[2]);
        }

        int tempoTotal = (vetHoras[0] *60) +  vetminutos[0];
        int contador=0;
        for (int i=0;i<n ; i++){


            int tempoPaciente = (vetHoras[i] * 60) + vetminutos[i] + vetTempoEspera[i];
            int horaPaciente = (vetHoras[i] * 60) + vetminutos[i];

            if (horaPaciente > tempoTotal){

                tempoTotal = horaPaciente;

            }

            if (tempoTotal > tempoPaciente){

                contador++;
            }

            tempoTotal+=30;
            
        }

        System.out.println(contador);
    }
}