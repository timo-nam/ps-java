import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(reader.readLine());
    StringTokenizer tokens = new StringTokenizer(reader.readLine());
    int max = 0;
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
      int value = Integer.parseInt(tokens.nextToken());
      
      if (value > max) {
        max = value;
      }
      
      sum += value;
    }
    
    System.out.println((double) (sum * 100) / (max * n));
  }
}