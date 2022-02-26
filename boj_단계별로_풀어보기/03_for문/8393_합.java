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
    int sum = 0;
    
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    
    writer.write(String.valueOf(sum) + "\n");
    writer.flush();
    writer.close();
  }
}