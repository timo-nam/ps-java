import java.util.Arrays;

class Solution {
    int answer;
    int[][] mDungeons;
    
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        mDungeons = dungeons;
        
        dfs(k, new boolean[dungeons.length], 0, 0);
        
        return answer;
    }
    
    void dfs(int k, boolean[] closed, int closedCounter, int counter) {
        /*
        System.out.printf("cal >> k(%d), counter(%d), ", k, counter);
        for (boolean c : closed) {
            System.out.printf("%d ", c ? 1 : 0);
        }
        System.out.println("");
        */
        
        for (int i = 0; i < closed.length; i++) {
            if (!closed[i]) {
                if (k >= mDungeons[i][0]) {
                    boolean[] copy = Arrays.copyOf(closed, closed.length);
                    copy[i] = true;
                    
                    dfs(k - mDungeons[i][1], copy, closedCounter + 1, counter + 1);
                } else {
                    closed[i] = true;
                    closedCounter++;
                }
            }
        }
        
        if (closedCounter == closed.length) {
            answer = Math.max(answer, counter);
            
            /*
            System.out.printf("ret >> k(%d), counter(%d), ", k, counter);
            for (boolean c : closed) {
                System.out.printf("%d ", c ? 1 : 0);
            }
            System.out.println("");
            */
        }
    }
}
