import java.util.Arrays;
import java.util.Comparator;

class Solution {
  public String solution(int[] numbers) {
    StringBuilder answer = new StringBuilder();
    
    String[] sNumbers = new String[numbers.length];
    
    for (int i = 0; i < numbers.length; i++) {
      sNumbers[i] = String.valueOf(numbers[i]);
    }
    
    Arrays.sort(sNumbers, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return (s2 + s1).compareTo(s1 + s2);
      }
    });
    
    for (String s : sNumbers) {
      answer.append(s);
    }
    
    return (answer.charAt(0) == '0') ? "0" : answer.toString();
  }
}