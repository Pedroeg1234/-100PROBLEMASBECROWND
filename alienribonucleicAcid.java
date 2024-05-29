import java.util.Scanner;
import java.util.Stack;

public class alienribonucleicAcid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String fita = scanner.next();
            String resp = "";
            int cont = 0;
            Stack<Character> pilha = new Stack<>();

            for (int i = 0; i < fita.length(); i++) {
                char currentChar = fita.charAt(i);
                if (currentChar == 'S')
                    resp += 'B';
                else if (currentChar == 'B')
                    resp += 'S';
                else if (currentChar == 'C')
                    resp += 'F';
                else if (currentChar == 'F')
                    resp += 'C';
            }

            for (int i = 0; i < resp.length(); i++) {
                if (pilha.isEmpty() || pilha.peek() != resp.charAt(i)) {
                    pilha.push(fita.charAt(i));
                } else {
                    while (true) {
                        if (pilha.isEmpty()) {
                            i--;
                            break;
                        } else if (resp.charAt(i) == pilha.peek()) {
                            cont++;
                            pilha.pop();
                            i++;
                        } else {
                            i--;
                            break;
                        }
                        if (i >= resp.length()) {
                            i--;
                            break;
                        }
                    }
                }
            }

            System.out.println(cont);
        }
    }
}
