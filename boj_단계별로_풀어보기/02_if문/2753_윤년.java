import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int year = Integer.parseInt(reader.readLine());
    
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      writer.write("1");
    } else {
      writer.write("0");
    }
    
    writer.write("\n");
    writer.flush();
    writer.close();
  }
}