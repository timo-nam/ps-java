import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int t = Integer.parseInt(reader.readLine());
    StringBuilder stringBuilder = new StringBuilder();
    
    for (int i = 0; i < t; i++) {
      char line[] = reader.readLine().toCharArray();
      int score = 0;
      int sum = 0;
      
      for (char ch : line) {
        if (ch == 'O') {
          score++;
          sum += score;
        } else { // ch == 'X'
          score = 0;
        }
      }
      
      stringBuilder.append(sum).append("\n");
    }
    
    System.out.print(stringBuilder);
  }
}