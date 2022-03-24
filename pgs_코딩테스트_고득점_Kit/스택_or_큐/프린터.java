import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Queue;

class Solution {
  public int solution(int[] priorities, int location) {
    int answer = 0;
    
    Queue<Task> q = new LinkedList<>();
    TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    
    for (int i = 0; i < priorities.length; i++) {
      int priority = priorities[i];
      q.offer(new Task(i, priority));
      treeMap.put(priority, treeMap.getOrDefault(priority, 0) + 1);
    }
    
    while (!q.isEmpty()) {
      int priority = q.peek().priority;
      if (priority == treeMap.lastKey()) {
        answer++;
        
        if (q.peek().order == location) {
          break;
        }
        
        q.poll();
        
        treeMap.put(priority, treeMap.get(priority) - 1);
        if (treeMap.get(priority) == 0) {
          treeMap.pollLastEntry();
        }
      } else { // priority != treeMap.lastKey()
        q.offer(q.poll());
      }
    }
    
    return answer;
  }
}

class Task {
  int order;
  int priority;
  
  Task(int order, int priority) {
    this.order = order;
    this.priority = priority;
  }
}