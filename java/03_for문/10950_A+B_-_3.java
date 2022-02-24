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
    
    int t = Integer.parseInt(reader.readLine());
    
    for (int i = 0; i < t; i++) {
      StringTokenizer tokens = new StringTokenizer(reader.readLine());
      int sum = Integer.parseInt(tokens.nextToken()) + Integer.parseInt(tokens.nextToken());
      writer.write(String.valueOf(sum) + "\n");
    }
    
    writer.flush();
    writer.close();
  }
}