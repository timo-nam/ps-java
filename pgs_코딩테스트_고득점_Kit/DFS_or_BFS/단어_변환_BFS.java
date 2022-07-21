import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean[] visited = new boolean[words.length];
        Queue<Info> q = new LinkedList<>();
        q.offer(new Info(0, begin));
        
        while (!q.isEmpty()) {
            Info now = q.poll();
            
            if (now.word.equals(target)) {
                answer = now.depth;
                break;
            }
            
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canChange(now.word, words[i])) {
                    q.offer(new Info(now.depth + 1, words[i]));
                    visited[i] = true;
                }
            }
        }
        
        return answer;
    }
    
    boolean canChange(String from, String to) {
        int counter = 0;
        
        for (int i = 0; i < from.length(); i++) {
            if (from.charAt(i) != to.charAt(i)) {
                counter++;
            }
        }
        
        return counter == 1 ? true : false;
    }
    
    class Info {
        int depth;
        String word;
        
        Info(int depth, String word) {
            this.depth = depth;
            this.word = word;
        }
    }
}
