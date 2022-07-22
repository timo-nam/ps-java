class Solution {
    
    boolean[] visited;
    int[][] mComputers;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        mComputers = computers;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i);
            }
        }
        
        return answer;
    }
    
    void dfs(int index) {
        visited[index] = true;
        
        for (int i = 0; i < mComputers[index].length; i++) {
            if (!visited[i] && mComputers[index][i] == 1) {
                dfs(i);
            }
        }
    }
}
