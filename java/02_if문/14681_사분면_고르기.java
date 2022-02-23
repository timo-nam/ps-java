import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int x = Integer.parseInt(reader.readLine());
    int y = Integer.parseInt(reader.readLine());
    
    if (x > 0) {
      if (y > 0) {
        writer.write("1");
      } else { // y < 0 (y != 0)
        writer.write("4");
      }
    } else { // x < 0 (x != 0)
      if (y > 0) {
        writer.write("2");
      } else { // y < 0 (y != 0)
        writer.write("3");
      }
    }
    
    writer.write("\n");
    writer.flush();
    writer.close();
  }
}