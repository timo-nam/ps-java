import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int score = Integer.parseInt(reader.readLine());
    
    switch (score / 10) {
      case 10:
      case 9:
        writer.write("A");
        break;
      case 8:
        writer.write("B");
        break;
      case 7:
        writer.write("C");
        break;
      case 6:
        writer.write("D");
        break;
      default:
        writer.write("F");
    }
    
    writer.write("\n");
    writer.flush();
    writer.close();
  }
}