import java.util.Arrays;

class Solution {
  public int solution(int[] citations) {
    Arrays.sort(citations);
    
    int h = 1;
    
    for (; h <= citations.length; h++) {
      if (citations[citations.length - h] < h) {
        break;
      }
    }
    
    return h - 1;
  }
}