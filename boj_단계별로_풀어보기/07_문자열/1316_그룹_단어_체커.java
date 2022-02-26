import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(reader.readLine());
    int counter = 0;
    
    for (int i = 0; i < n; i++) {
      if (Main.isGroupWord(reader.readLine())) {
        counter++;
      }
    }
    
    System.out.println(counter);
  }
  
  static boolean isGroupWord(String word) {
    char[] wordArray = word.toCharArray();
    boolean[] already = new boolean['z' - 'a' + 1];
    
    int alphabet = wordArray[0] - 'a';
    already[alphabet] = true;
    
    for (int i = 1; i < wordArray.length; i++) {
      alphabet = wordArray[i] - 'a';
      if (already[alphabet] == false) {
        already[alphabet] = true;
      } else if (wordArray[i] != wordArray[i - 1]) { // with "already[alphabet] == true"
        return false;
      }
    }
    
    return true;
  }
}