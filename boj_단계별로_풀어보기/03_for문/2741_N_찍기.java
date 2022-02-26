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
    StringBuilder stringBuilder = new StringBuilder();
    
    for (int i = 1; i <= n; i++) {
      stringBuilder.append(i);
      stringBuilder.append("\n");
    }
    
    writer.write(stringBuilder.toString());
    writer.flush();
    writer.close();
  }
}