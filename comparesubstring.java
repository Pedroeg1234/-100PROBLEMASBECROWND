import java.util.Scanner;

public class comparesubstring {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String verificar = scanner.nextLine();
        
        int maior=0;
        for (int i=0;i<verificar.length();i++){

            int quantidade=0;
            for (int j=0;j<entrada.length();j++){

                int k=i;
                int l=j;

                while (k < entrada.length() && l < verificar.length() && verificar.charAt(k) == entrada.charAt(l)){

                    quantidade++;

                    k++;
                    l++;
                }

                if (quantidade > maior){
                    maior= quantidade;
                }
            }

        }

        System.out.println(maior);
    }
}
