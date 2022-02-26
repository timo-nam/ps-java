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
    
    String nString = String.valueOf(n) + " * ";
    for (int i = 1; i <= 9; i++) {
      int result = n * i;
      writer.write(nString + String.valueOf(i) + " = " + String.valueOf(result) + "\n");
    }
    
    writer.flush();
    writer.close();
  }
}