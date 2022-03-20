import java.util.TreeMap;

class Solution {
  public int[] solution(String[] operations) {    
    TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    
    for (String operation : operations) {
      if (operation.charAt(0) == 'I') {
        Integer value = Integer.valueOf(operation.substring(2));
        treeMap.put(value, treeMap.getOrDefault(value, 0) + 1);
      } else { // operation.charAt(0) == 'D'
        if (!treeMap.isEmpty()) {
          if (operation.equals("D 1")) {
            if (treeMap.lastEntry().getValue() == 1) {
              treeMap.pollLastEntry();
            }
          } else { // operation.equals("D -1"
            if (treeMap.firstEntry().getValue() == 1) {
              treeMap.pollFirstEntry();
            }
          }
        }
      } 
    }
    
    int[] answer = new int[2];
    if (!treeMap.isEmpty()) {
      answer[0] = treeMap.lastKey();
      answer[1] = treeMap.firstKey();
    }
    return answer;
  }
}