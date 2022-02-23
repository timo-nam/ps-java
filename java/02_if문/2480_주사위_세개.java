import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int maxPip = 0;
    int mostFreqentPip = 0;
    int biggestFreqency = 0;
    int[] counter = new int[7];
    StringTokenizer tokens = new StringTokenizer(reader.readLine());
    
    for (int i = 0; i < 3; i++) {
      int n = Integer.parseInt(tokens.nextToken());
      
      if (n > maxPip) {
        maxPip = n;
      }
      
      counter[n]++;
      if (counter[n] > biggestFreqency) {
        mostFreqentPip = n;
        biggestFreqency = counter[n];
      }
    }
    
    int prize = 0;
    
    switch (biggestFreqency) {
      case 3:
        prize = 10000 + mostFreqentPip * 1000;
        break;
      case 2:
        prize = 1000 + mostFreqentPip * 100;
        break;
      case 1:
        prize = maxPip * 100;
        break;
      default:
    }
    
    writer.write(String.valueOf(prize) + "\n");
    writer.flush();
    writer.close();
  }
}