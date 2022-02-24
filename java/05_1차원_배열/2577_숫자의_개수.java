import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int product = 1;
    for (int i = 0; i < 3; i++) {
      product *= Integer.parseInt(reader.readLine());
    }
    
    char[] productCharArray = String.valueOf(product).toCharArray();
    int[] counter = new int[10];
    
    for (char digit : productCharArray) {
      counter[digit - '0']++;
    }
    
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      stringBuilder.append(counter[i]).append("\n");
    }
    
    System.out.print(stringBuilder.toString());
  }
}