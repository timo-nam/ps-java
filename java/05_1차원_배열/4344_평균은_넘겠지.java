import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int c = Integer.parseInt(reader.readLine());
    
    for (int i = 0; i < c; i++) {
      StringTokenizer tokens = new StringTokenizer(reader.readLine());
      
      int n = Integer.parseInt(tokens.nextToken());
      int[] array = new int[n];
      int sum = 0;
      
      for (int j = 0; j < n; j++) {
        int value = Integer.parseInt(tokens.nextToken());
        array[j] = value;
        sum += value;
      }
      
      double average = (double) sum / n;
      
      int counter = 0;
      
      Arrays.sort(array);
      for (int j = n - 1; j >= 0; j--) {
        if (array[j] > average) {
          counter++;
        } else { // array[j] <= average
          break;
        }
      }
      
      double percentage = (double) (counter * 100) / n;
      writer.write(String.format("%.3f", percentage));
      writer.write("%\n");
    }
    
    writer.flush();
    writer.close();
  }
}