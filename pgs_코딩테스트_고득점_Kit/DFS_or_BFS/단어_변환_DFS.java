import java.util.Arrays;

class Solution {
    String mBegin;
    String mTarget;
    String[] mWords;
    int answer;
    boolean[] visited;
    
    public int solution(String begin, String target, String[] words) {
        mBegin = begin;
        mTarget = target;
        mWords = words;
        answer = words.length + 1;
        visited = new boolean[words.length];
        
        if (Arrays.asList(words).contains(target)) {
            for (int i = 0; i < words.length; i++) {
                dfs(i, begin, 0);
            }
        } else {
            answer = 0;
        }
        
        return answer;
    }
    
    void dfs(int index, String word, int counter) {
        if (!canChange(index, word)) {
            return;
        }
        // else
        visited[index] = true;
        word = mWords[index];
        counter++;
        
        if (word.equals(mTarget)) {
            answer = Math.min(answer, counter);
        }
        
        for (int i = 0; i < mWords.length; i++) {
            dfs(i, mWords[index], counter);
        }
        
        visited[index] = false;
    }
    
    boolean canChange(int index, String word) {
        if (!visited[index] && getHowManyDiff(mWords[index], word) == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    int getHowManyDiff(String to, String from) {
        int counter = 0;
        
        for (int i = 0; i < to.length(); i++) {
            if (to.charAt(i) != from.charAt(i)) {
                counter++;
            }
        }
        
        return counter;
    }
}
