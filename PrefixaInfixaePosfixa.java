import java.util.Scanner;

public class PrefixaInfixaePosfixa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while (cases-- > 0) {
            int n = sc.nextInt();
            String pre = sc.next();
            String in = sc.next();

            String pos = findPostfix(pre, in);

            System.out.println(pos);
        }
    }

    static String findPostfix(String pre, String in) {
        if (pre.isEmpty()) 
            return "";

        char raiz = pre.charAt(0);

        // posição da raiz 
        int raizIndex = in.indexOf(raiz);

        String esquerda = findPostfix(pre.substring(1, raizIndex + 1), in.substring(0, raizIndex));

        String direita = findPostfix(pre.substring(raizIndex + 1), in.substring(raizIndex + 1));

        return esquerda + direita + raiz;
    }
}
