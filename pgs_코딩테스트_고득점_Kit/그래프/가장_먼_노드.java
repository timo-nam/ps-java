import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n, int[][] edge) {
        boolean[][] graph = buildGraph(n, edge);
        return bfs(graph);
    }

    int bfs(boolean[][] graph) {
        boolean[] isVisited = new boolean[graph.length];
        isVisited[1] = true;
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1));

        int numOfNodeInDepth = 0;

        while (!q.isEmpty()) {
            numOfNodeInDepth = q.size();

            for (int i = 0; i < numOfNodeInDepth; i++) {
                Integer node = q.poll();

                for (int j = 1; j < graph.length; j++) {
                    if (graph[node][j] && !isVisited[j]) {
                        isVisited[j] = true;
                        q.offer(j);
                    }
                }
            }
        }

        return numOfNodeInDepth;
    }

    boolean[][] buildGraph(int n, int[][] edge) {
        int graphSize = n + 1;
        boolean[][] graph = new boolean[graphSize][graphSize];

        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];
            graph[a][b] = graph[b][a] = true;
        }

        return graph;
    }
}

