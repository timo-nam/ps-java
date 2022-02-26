import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int max = 0;
    int maxIndex = -1;
    for (int i = 0; i < 9; i++) {
      int value = Integer.parseInt(reader.readLine());
      
      if (value > max) {
        max = value;
        maxIndex = i;
      }
    }
    
    System.out.println(max + "\n" + maxIn);
  }
}