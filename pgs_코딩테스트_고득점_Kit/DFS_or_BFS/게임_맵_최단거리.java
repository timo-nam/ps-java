import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int[][] mMaps;
    int n;
    int m;
    boolean[][] visited;
    
    public int solution(int[][] maps) {
        mMaps = maps;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        
        bfs();
        
        int answer =  mMaps[n - 1][m - 1];
        return answer > 1 ? answer : -1;
    }
    
    int bfs() {
        Queue<Point> q = new LinkedList<>();
        
        visited[0][0] = true;
        q.offer(new Point(0, 0));
        
        while (!q.isEmpty()) {
            Point p = q.poll();
            
            for (int i = 0; i < 4; i++) {
                Point next = getNext(p, i);
                
                if (canGo(next)) {
                    mMaps[next.r][next.c] = mMaps[p.r][p.c] + 1;
                    
                    visited[next.r][next.c] = true;
                    q.offer(next);
                }
            }
        }
        
        return 0;
    }
    
    boolean canGo(Point p) {
        if (
            p.r < 0 || p.r >= n || p.c < 0 || p.c >= m ||
            mMaps[p.r][p.c] == 0 ||
            visited[p.r][p.c]
        ) {
            return false;
        } else {
            return true;
        }
    }
    
    Point getNext(Point p, int dir) {
        Point next = null;
        
        switch (dir) {
            case 0:
                next = new Point(p.r - 1, p.c);
                break;
            case 1:
                next = new Point(p.r, p.c + 1);
                break;
            case 2:
                next = new Point(p.r + 1, p.c);
                break;
            case 3:
                next = new Point(p.r, p.c - 1);
                break;
        }
        
        return next;
    }
    
    class Point {
        int r;
        int c;
        
        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
