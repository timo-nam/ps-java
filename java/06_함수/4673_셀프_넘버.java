import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
  final static int UPPER_BOUND = 101;
  static boolean[] numbers = new boolean[Main.UPPER_BOUND];
  
  public static void main(String[] args) throws IOException {
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
  	
    for (int i = 1; i < Main.UPPER_BOUND; i++) {
      int y = Main.d(i);
      if (y < Main.UPPER_BOUND) {
        numbers[y] = true;
      }
    }
    
    for (int i = 1; i < Main.UPPER_BOUND; i++) {
      if (numbers[i] == false) {
        writer.write(String.valueOf(i));
        writer.write("\n");
      }
    }
    
    writer.flush();
    writer.close();
  }
  
  static int d(int n) {
    int sum = n;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}