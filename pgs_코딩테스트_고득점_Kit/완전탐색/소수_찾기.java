import java.util.HashSet;
import java.util.Set;

class Solution {
    String mNumbers;
    boolean[] visited;
    Set<Integer> set;
    int counter = 0;
    
    public int solution(String numbers) {
        mNumbers = numbers;
        visited = new boolean[mNumbers.length()];
        set = new HashSet<>();
        
        for (int i = 0; i < mNumbers.length(); i++) {
            dfs(i, "");
        }
        
        return counter;
    }
    
    void dfs(int index, String str) {
        visited[index] = true;
        
        str += String.valueOf(mNumbers.charAt(index));
        int num = Integer.valueOf(str);
        
        if (!set.contains(num)) {
            set.add(num);
            if (isPrime(num)) {
                counter++;
            }
        }
        
        for (int i = 0; i < mNumbers.length(); i++) {
            if (!visited[i]) {
                dfs(i, str);
            }
        }
        
        visited[index] = false;
    }
    
    boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        // else
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
