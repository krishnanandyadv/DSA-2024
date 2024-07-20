import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinimumKeyPresses {
    public static int minKeyPresses(String S) {
        int target = Integer.parseInt(S);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.offer(0);
        visited.add(0);
        int steps = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                
                if (current == target) {
                    return steps;
                }
                
                // Try pressing each digit key (0-9)
                for (int j = 0; j <= 9; j++) {
                    int next = current * 10 + j;
                    if (next <= target && !visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
                
                // Try pressing the "00" key
                int next = current * 100;
                if (next <= target && !visited.contains(next)) {
                    queue.offer(next);
                    visited.add(next);
                }
            }
            
            steps++;
        }
        
        return -1; // This should never be reached if input is a valid numeric string
    }
    
    public static void main(String[] args) {
        String input1 = "60004";
        int result = minKeyPresses(input1);
        System.out.println("Minimum number of key presses: " + result); // Output: 4
    }
}
