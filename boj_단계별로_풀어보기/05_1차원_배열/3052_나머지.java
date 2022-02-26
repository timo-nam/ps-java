import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  static final int DENOMINATION = 42;
  
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int[] counter = new int[DENOMINATION];
    for (int i = 0; i < 10; i++) {
      int value = Integer.parseInt(reader.readLine());
      counter[value % DENOMINATION]++;
    }
    
    int n = 0;
    for(int c : counter) {
      if (c > 0) {
        n++;
      }
    }
    
    System.out.println(n);
  }
}