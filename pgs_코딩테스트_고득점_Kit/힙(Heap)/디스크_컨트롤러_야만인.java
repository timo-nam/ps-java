import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
  public int solution(int[][] jobs) {
    int sum = 0;
    
    Arrays.sort(jobs, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
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
    while (i < jobs.length) {
      if (waitingQ.isEmpty() && ms < jobs[i][0]) {
        ms = jobs[i][0];
      }
      
      while (i < jobs.length && jobs[i][0] <= ms) {
        waitingQ.add(new Task(jobs[i]));
        i++;
      }
      
      ms += waitingQ.peek().during;
      sum += ms - waitingQ.poll().in;
    }
    
    while (!waitingQ.isEmpty()) {
      ms += waitingQ.peek().during;
      sum += ms - waitingQ.poll().in;
    }
    
    return sum / jobs.length;
  }
}

class Task {
  int in;
  int during;
  
  Task(int[] job) {
    in = job[0];
    during = job[1];
  }
}