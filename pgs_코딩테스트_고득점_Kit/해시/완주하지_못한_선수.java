import java.util.HashMap;
import java.util.Map;

class Solution {
  public String solution(String[] participant, String[] completion) {
    String answer = "";
    
    Map<String, Integer> map = new HashMap<>();
    
    for (String c : completion) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else { // map doesn't contain key "c"
        map.put(c, 1);
      }
    }
    
    for (String p : participant) {
      if (map.containsKey(p)) {
        if (map.get(p) > 1) {
          map.put(p, map.get(p) - 1);
        } else { // map.get(p) == 1
          map.remove(p);
        }
      } else { // map doesn't contain key "p"
        answer = p;
        break;
      }
    }
    
    return answer;
  }
}