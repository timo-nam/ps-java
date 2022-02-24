import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer line = null;
    
    line = new StringTokenizer(reader.readLine());
    int n = Integer.parseInt(line.nextToken());
    int x = Integer.parseInt(line.nextToken());
    
    line = new StringTokenizer(reader.readLine());
    StringBuilder stringBuilder = new StringBuilder();
    
    for (int i = 0; i < n; i++) {
      int number = Integer.parseInt(line.nextToken());
      
      if (number < x) {
        stringBuilder.append(number).append(" ");
      }
    }
    stringBuilder.append("\n");
    
    System.out.println(stringBuilder);
  }
}