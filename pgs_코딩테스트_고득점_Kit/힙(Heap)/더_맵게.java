import java.util.PriorityQueue;

class Solution {
  public int solution(int[] scoville, int K) {
    int answer = 0;
    
    PriorityQueue<Integer> pQ = new PriorityQueue<>();
    
    for (int s : scoville) {
      pQ.add(s);
    }
    
    while (!pQ.isEmpty()) {
      int min = pQ.poll();
      if (min >= K) {
        break;
      } else if (pQ.isEmpty()) {
        answer = -1;
        break;
      } else { // min < K && pq.isEmpty() == false
        pQ.add(min + (pQ.poll() * 2));
        answer++;
      }
    }
    
    return answer;
  }
}