import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
  public int solution(int[][] jobs) {
    int sum = 0;
    
    Integer[][] wrapper = new Integer[jobs.length][];
    
    for (int i = 0; i < jobs.length; i++) {
      wrapper[i] = new Integer[2];
      for (int j = 0; j < 2; j++) {
        wrapper[i][j] = jobs[i][j];
      }
    }
    
    Arrays.sort(wrapper, new Comparator<Integer[]>() {
      @Override
      public int compare(Integer[] a1, Integer[] a2) {
        return a1[0] - a2[0];
      }
    });
    
    PriorityQueue<Task> waitingQ = new PriorityQueue<>(
        new Comparator<Task>() {
          @Override
          public int compare(Task t1, Task t2) {
            return t1.during - t2.during;
          }
        }
    );
    
    int i = 0;
    int ms = 0;
    while (i < wrapper.length) {
      if (waitingQ.isEmpty() && ms < wrapper[i][0]) {
        ms = wrapper[i][0];
      }
      
      while (i < wrapper.length && wrapper[i][0] <= ms) {
        waitingQ.add(new Task(wrapper[i]));
        i++;
      }
      
      ms += waitingQ.peek().during;
      sum += ms - waitingQ.poll().in;
    }
    
    while (!waitingQ.isEmpty()) {
      ms += waitingQ.peek().during;
      sum += ms - waitingQ.poll().in;
    }
    
    return sum / wrapper.length;
  }
}

class Task {
  int in;
  int during;
  
  Task(Integer[] job) {
    in = job[0];
    during = job[1];
  }
}