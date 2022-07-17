class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int b = -(brown / 2 + 2);
        int c = brown + yellow;
        
        int sqrt = (int) Math.sqrt(b * b - 4 * c);
        
        answer[0] = (-b + sqrt) / 2;
        answer[1] = (-b - sqrt) / 2;
        
        return answer;
    }
}
