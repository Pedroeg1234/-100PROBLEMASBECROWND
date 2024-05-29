import java.util.*;

public class EachiansI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            // Read text
            String text = scanner.nextLine();
            
            // Read number of words
            int M = scanner.nextInt();
            scanner.nextLine(); // Consume newline after M
            
            // Read words
            String[] words = new String[M];
            for (int i = 0; i < M; i++) {
                words[i] = scanner.next();
            }
            scanner.nextLine(); // Consume newline after words
            
            // Process each word
            for (String word : words) {
                List<Integer> positions = findWordPositions(text, word);
                if (positions.isEmpty()) {
                    System.out.println("-1");
                } else {
                    StringBuilder result = new StringBuilder();
                    for (int pos : positions) {
                        result.append(pos).append(" ");
                    }
                    // Remove trailing space and print
                    System.out.println(result.toString().trim());
                }
            }
        }
        scanner.close();
    }

    // Function to find all occurrences of word in text
    public static List<Integer> findWordPositions(String text, String word) {
        List<Integer> positions = new ArrayList<>();
        int index = text.indexOf(word);
        while (index >= 0) {
            positions.add(index);
            index = text.indexOf(word, index + 1);
        }
        return positions;
    }
}
