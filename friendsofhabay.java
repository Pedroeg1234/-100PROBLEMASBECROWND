
 import java.util.Scanner;
 import java.util.ArrayList;

public class friendsofhabay {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        ArrayList<String> vetorSim= new ArrayList<String>();
        ArrayList<String> vetorNao= new ArrayList<String>();
        while (true){

            String entrada= scanner.nextLine();


            if (entrada.equals("FIM")){
                break;
            }

            
            String partes[]= entrada.split(" ");

            if (partes.length >=2){
            if (partes[1].equals("SIM")){

                if (!vetorSim.contains(partes[0])){
                vetorSim.add(partes[0]);
            } 
        }else{

            if (!vetorNao.contains(partes[0])){
                vetorNao.add(partes[0]);
            }
        }
        }
    }
            SelectionSort(vetorSim);
            SelectionSort(vetorNao);

            String maior= vetorSim.get(0);
            for (int i=0;i<vetorSim.size();i++){

                if (vetorSim.get(i).length() > maior.length()){

                    maior= vetorSim.get(i);
                }
            }

            for (int j=0;j<vetorSim.size(); j++){

                System.out.println(vetorSim.get(j));
            }

            for (int k=0;k<vetorNao.size();k++){

                System.out.println(vetorNao.get(k));
            }
        
        System.out.println ("AMIGO DO HABAY " + maior);
        }

        
    

    public static void SelectionSort(ArrayList<String> arrayList ){

        int n= arrayList.size();
            for (int i=0;i<n-1; i++){

                int minIndex=i;

                for (int j=i+1; j<n;j++){

                   if( arrayList.get(j).compareTo(arrayList.get(minIndex)) <0){

                        minIndex=j;
                    }
                }

                String temp= arrayList.get(minIndex);
                arrayList.set(minIndex, arrayList.get(i));
                arrayList.set(i, temp);

            }
    }
}