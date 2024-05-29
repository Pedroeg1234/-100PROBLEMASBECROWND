import java.util.Scanner;

public class ilhasisoladas{

    public static void main(String[] args){

        Scanner scanner= new Scanner (System.in);

        int n= scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        String frente[] = new String[n];
        String tras [] = new String[n];

        for (int i=0; i< n; i++){
            String frase= scanner.nextLine();
            String partes[]= frase.split("->");
            frente[i] = partes[0];
            tras[i] = partes[1];
        }

        boolean invertible = invertible(frente, tras, n);
        boolean notInvertible = notInvertible(tras, n);

        if (invertible) {
            System.out.println("Invertible");
        } else if (notInvertible) {
            System.out.println("Not invertible");
        } else {
            System.out.println("Not a function");
        }
    }
    
    public static boolean invertible (String frente[], String tras[], int n){

        boolean invert=true;
        for (int i=0; i<n; i++){
            String frenteAtual= frente[i];
            for (int j=0; j<n; j++){
                if (frenteAtual.equals(tras[j])){
                    invert=false;
                }
            }
        }

        return invert;
    }

    public static boolean notInvertible (String tras[], int n){

        boolean funcao = true;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (tras[j].equals(tras[i])){
                    funcao = false;
                    break;
                }
            }
        }

        return funcao;
    }
}
