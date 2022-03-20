import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
  public int[] solution(String[] operations) {
    Deque<Integer> deQ = new LinkedList<>();
    
    for (String operation : operations) {
      if (operation.charAt(0) == 'I') {
        deQ.offerFirst(Integer.valueOf(operation.substring(2)));
        ((List<Integer>) deQ).sort(Comparator.naturalOrder());
      } else if (operation.equals("D 1")) {
        deQ.pollLast();
      } else { // operation.equals("D -1")
        deQ.pollFirst();
      }
    }
    
    int[] answer = new int[2];
    if (!deQ.isEmpty()) {
      answer[0] = deQ.peekLast();
      answer[1] = deQ.peekFirst();
    }
    return answer;
  }
}