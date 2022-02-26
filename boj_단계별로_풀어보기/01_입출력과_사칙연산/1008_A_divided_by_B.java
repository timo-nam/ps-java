import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
  static BufferedReader reader;
  static BufferedWriter writer;
  
  public static void main(String[] args) throws IOException {
    Main.reader = new BufferedReader(new InputStreamReader(System.in));
    Main.writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    StringTokenizer tokens = new StringTokenizer(reader.readLine());
    int numerator = Integer.parseInt(tokens.nextToken());
    int denominator = Integer.parseInt(tokens.nextToken());
    
    numerator = operate(numerator, denominator);
    
    if (numerator != 0) {
      Main.writer.write(".");
      
      for (int i = 0; i < 9; i++) {
      	numerator = operate(numerator, denominator);
        
        if (numerator == 0) {
          break;
        }
      }
    }
    
    Main.writer.write("\n");
    Main.writer.flush();
    Main.writer.close();
  }
  
  /** Write a quotient on the buffer, return a next numerator */
  static int operate(int numerator, int denominator) throws IOException {
    writer.write(String.valueOf(numerator / denominator));
    return numerator % denominator * 10;
  }
}