import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(reader.readLine());
    int newNumber = n;
    int counter = 0;
    
    while (true) {
      int digitSum = (newNumber / 10) + (newNumber % 10);
      newNumber = (newNumber % 10 * 10) + (digitSum % 10);
      
      counter++;
      
      if (newNumber == n) {
        break;
      }
    }
    
    System.out.println(counter);
  }
}