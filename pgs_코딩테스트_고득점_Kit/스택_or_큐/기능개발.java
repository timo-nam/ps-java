import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
  public int[] solution(int[] progresses, int[] speeds) {
    Queue<int[]> q = new LinkedList<>();
    
    for (int i = 0; i < progresses.length; i++) {
      q.offer(new int[] {progresses[i], speeds[i]});
    }
    
    List<Integer> list = new LinkedList<>();
    
    int day = 0;
    while (!q.isEmpty()) {
      int[] first = q.poll();
      
      first[0] += day * first[1];
      if (first[0] < 100) {
        day += (int) Math.ceil((100 - first[0]) / (double) first[1]);
      }
      
      int counter = 1;
      
      while (!q.isEmpty()) {
        first = q.peek();
        if (first[0] + first[1] * day >= 100) {
          q.poll();
          counter++;
        } else {
          break;
        }
      }
        
      list.add(counter);
    }
    
    int[] answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }
    return answer;
  }
}