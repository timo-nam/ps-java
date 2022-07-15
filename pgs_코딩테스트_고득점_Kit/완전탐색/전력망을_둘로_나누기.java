import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n - 1;
        
        boolean[][] graph = new boolean[n + 1][n + 1];
        
        for (int[] wire : wires) {
            setGraph(graph, wire, true);
        }
        
        for (int[] wire : wires) {
            setGraph(graph, wire, false);
            
            answer = Math.min(answer, bfs(wire[0], graph));
            
            setGraph(graph, wire, true);
        }
        
        return answer;
    }
    
    int bfs(int start, boolean[][] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        int counter = 0;
        
        q.offer(start);
        visited[start] = true;
        
        while (!q.isEmpty()) {
            int head = q.poll();
            counter++;
            
            for (int i = 0; i < graph.length; i++) {
                if (!visited[i] && graph[head][i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
        
        return Math.abs(2 * counter - graph.length + 1);
    }
    
    void setGraph(boolean[][] graph, int[] wire, boolean bool) {
        int v1 = wire[0];
        int v2 = wire[1];
        
        graph[v1][v2] = bool;
        graph[v2][v1] = bool;
    }
}
