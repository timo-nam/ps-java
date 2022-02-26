import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(reader.readLine());
    int max = -1000001;
    int min =  1000001;
    StringTokenizer tokens = new StringTokenizer(reader.readLine());
    
    for (int i = 0; i < n; i++) {
      int value = Integer.parseInt(tokens.nextToken());
      
      if (value > max) {
        max = value;
      }
      
      if (value < min) {
        min = value;
      }
    }
    
    System.out.println(min + " " + max);
  }
}