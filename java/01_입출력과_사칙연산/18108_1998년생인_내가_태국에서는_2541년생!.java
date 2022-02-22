import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int y = Integer.parseInt(reader.readLine());
    
    writer.write(String.valueOf(y - 543) + "\n");
    writer.flush();
    writer.close();
  }
}