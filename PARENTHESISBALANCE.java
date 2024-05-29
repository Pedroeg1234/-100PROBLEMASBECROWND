import java.util.*;

public class PARENTHESISBALANCE {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        
        while (scanner.hasNextLine()) {
            String expression = scanner.nextLine().trim();
            String result = checkParenthesisBalance(expression);
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    public static String checkParenthesisBalance(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return "incorrect";
                }
                char top = stack.pop();
                if (top != '(') {
                    return "incorrect";
                }
            }
        }
        
        if (stack.isEmpty()) {
            return "correct";
        } else {
            return "incorrect";
        }
    }
}
