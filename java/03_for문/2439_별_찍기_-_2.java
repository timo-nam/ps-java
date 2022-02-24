import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(reader.readLine());
    
    StringBuilder spaces = new StringBuilder();
    for (int i = 0; i < n; i++) {
      spaces.append(" ");
    }
    
    StringBuilder stars = new StringBuilder();
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      spaces.deleteCharAt(n - i - 1); // spaces.length() == n - i
      result.append(spaces);
      
      stars.append("*");
      result.append(stars);
      
      result.append("\n");
    }
    
    writer.write(result.toString());
    writer.flush();
    writer.close();
  }
}