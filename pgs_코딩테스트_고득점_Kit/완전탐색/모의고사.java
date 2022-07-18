import java.util.ArrayList;
import java.util.List;

class Solution {
    static final int[][] JJIK = new int[][] {
        { },
        { 1, 2, 3, 4, 5 },
        { 2, 1, 2, 3, 2, 4, 2, 5 },
        { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }
    };
    
    public int[] solution(int[] answers) {
        int[] score = new int[4];
        
        for (int i = 0; i < answers.length; i++) {
            for (int j = 1; j < 4; j++) {
                int[] whos = JJIK[j];
                if (whos[i % whos.length] == answers[i]) {
                    score[j]++;
                }
            }
        }
        
        int maxScore = -1;
        
        for (int s : score) {
            maxScore = Math.max(maxScore, s);
        }
        
        List<Integer> best = new ArrayList<>();
        
        for (int i = 1; i < score.length; i++) {
            if (score[i] == maxScore) {
                maxScore = score[i];
                best.add(i);
            }
        }
        
        int[] answer = new int[best.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = best.get(i);
        }
        
        return answer;
    }
}
