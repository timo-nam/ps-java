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
    
    StringTokenizer tokens = new StringTokenizer(reader.readLine());
    int a = Integer.parseInt(tokens.nextToken());
    int b = Integer.parseInt(tokens.nextToken());
    
    writer.write(String.valueOf(a + b) + "\n"
               + String.valueOf(a - b) + "\n"
               + String.valueOf(a * b) + "\n"
               + String.valueOf(a / b) + "\n"
               + String.valueOf(a % b) + "\n"
    );
    writer.flush();
    writer.close();
  }
}