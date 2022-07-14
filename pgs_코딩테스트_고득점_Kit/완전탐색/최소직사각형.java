import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[][] sizes) {
        Queue<Pair> maxHeapForLarge = MaxHeapBuilder.build();
        Queue<Pair> maxHeapForSmall = MaxHeapBuilder.build();
        
        for (int i = 0; i < sizes.length; i++) {
            int large = Math.max(sizes[i][0], sizes[i][1]);
            int small = Math.min(sizes[i][0], sizes[i][1]);
            
            maxHeapForLarge.add(new Pair(i, large));
            maxHeapForSmall.add(new Pair(i, small));
        }
        
        return maxHeapForLarge.peek().value * maxHeapForSmall.peek().value;
    }
}

class MaxHeapBuilder {
    static Queue<Pair> build() {
        return new PriorityQueue<>((p1, p2) -> {
            return p2.value - p1.value;
        });
    }
}

class Pair {
    int index;
    int value;

    Pair(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

