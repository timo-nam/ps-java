import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    StringBuilder stringBuilder = new StringBuilder();
    
    String line;
    while ((line = reader.readLine()) != null) {
      StringTokenizer tokens = new StringTokenizer(line);
      int a = Integer.parseInt(tokens.nextToken());
      int b = Integer.parseInt(tokens.nextToken());
      
      stringBuilder.append(a + b).append("\n");
    }
    
    writer.write(stringBuilder.toString());
    writer.flush();
    writer.close();
  }
}