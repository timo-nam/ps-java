import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int bCopy = b;
    
    while (b != 0) {
      int digit = b % 10;
      writer.write(String.valueOf(a * digit) + "\n");
      
      b /= 10;
    }
    
    writer.write(String.valueOf(a * bCopy) + "\n");
    
    writer.flush();
    writer.close();
  }
}