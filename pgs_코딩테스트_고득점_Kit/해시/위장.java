import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
  public int solution(String[][] clothes) {
    int answer = 1;
    
    Map<String, Integer> map = new HashMap<>();
    
    for (String[] c : clothes) {
      map.put(c[1], map.getOrDefault(c[1], 0) + 1);
    }
    
    for (Entry<String, Integer> e : map.entrySet()) {
      answer *= e.getValue() + 1;
    }
    
    return answer - 1;
  }
}