class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String alphabets = "AEIOU";
        int[] diff = {
            781, 156, 31, 6, 1
        };
        
        for (int i = 0; i < word.length(); i++) {
            answer += alphabets.indexOf(word.charAt(i)) * diff[i] + 1;
        }
        
        return answer;
    }
}
