class Solution {
    int[] mNumbers;
    int mTarget;
    boolean[] visited;
    int counter = 0;
    
    public int solution(int[] numbers, int target) {
        mNumbers = numbers;
        mTarget = target;
        
        visited = new boolean[mNumbers.length];
        
        dfs(0, 0);
        
        return counter;
    }
    
    void dfs(int index, int sum) {
        int positive = sum + mNumbers[index];
        int negative = sum - mNumbers[index];
        
        index += 1;
        
        if (index == mNumbers.length) {
            if (positive == mTarget) {
                counter++;
            }
            
            if (negative == mTarget) {
                counter++;
            }
            
            return;
        }
        // else
        if (!visited[index]) {
            dfs(index, positive);
            dfs(index, negative);
        }
    }
}
