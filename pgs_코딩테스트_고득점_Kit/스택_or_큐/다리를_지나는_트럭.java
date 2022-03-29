import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    
    int done = 0;
    int onWeight = 0;
    Queue<Truck> onQ = new LinkedList<>();
    int next = 0;
    
    while (done < truck_weights.length) {
      int qSize = onQ.size();
      for (Truck t : onQ) {
        t.move();
      }
      
      if (!onQ.isEmpty() && onQ.peek().left == 0) {
        done++;
        onWeight -= onQ.poll().weight;
      }
      
      if (next < truck_weights.length
          && onWeight + truck_weights[next] <= weight) {
        onWeight += truck_weights[next];
        onQ.offer(new Truck(truck_weights[next], bridge_length));
        next++;
      }
      
      answer++;
    }
    
    return answer;
  }
}

class Truck {
  int weight;
  int left;
  
  Truck (int weight, int left) {
    this.weight = weight;
    this.left = left;
  }
  
  void move() {
    this.left--;
  }
}