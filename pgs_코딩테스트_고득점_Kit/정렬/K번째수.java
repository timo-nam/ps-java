import java.util.Arrays;

class Solution {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    
    for (int i = 0; i < commands.length; i++) {
      int[] copy = Arrays.copyOf(array, array.length);
      int[] command = commands[i];
      Arrays.sort(copy, command[0] - 1, command[1]);
      answer[i] = copy[command[0] + command[2] - 2];
    }
    
    return answer;
  }
}