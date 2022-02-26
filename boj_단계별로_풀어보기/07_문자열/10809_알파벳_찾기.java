import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    char[] word = reader.readLine().toCharArray();
    
    int[] firstPosition = new int['z' - 'a' + 1];
    Arrays.fill(firstPosition, -1);
    
    for (int i = 0; i < word.length; i++) {
      int index = word[i] - 'a';
      if (firstPosition[index] == -1) {
        firstPosition[index] = i;
      }
    }
    
    for (int f : firstPosition) {
      writer.write(String.valueOf(f));
      writer.write(" ");
    }
    
    writer.write("\n");
    writer.flush();
    writer.close();
  }
}