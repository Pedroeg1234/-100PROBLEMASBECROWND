import java.util.Scanner;

public class seekingFlower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read N and M
        int N = scanner.nextInt(); // current number of followers
        int M = scanner.nextInt(); // minimum number of followers required
        
        // Read the last 30 days followers count
        int[] D = new int[30];
        for (int i = 0; i < 30; i++) {
            D[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Binary search for the minimum number of days required
        int low = 0;
        int high = 100000; // starting with a high enough upper bound
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (canReachWithinNDays(N, M, D, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        System.out.println(low);
    }
    
    // Function to check if we can reach at least M followers within N days
    private static boolean canReachWithinNDays(int currentFollowers, int targetFollowers, int[] D, int days) {
        long totalFollowers = currentFollowers;
        
        for (int i = Math.max(0, 30 - days); i < 30; i++) {
            totalFollowers += D[i];
            if (totalFollowers >= targetFollowers) {
                return true;
            }
        }
        
        return false;
    }
}
