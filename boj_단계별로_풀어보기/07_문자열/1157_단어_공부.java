import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] wordArray = scanner.nextLine().toUpperCase().toCharArray();
    int[] counter = new int['Z' - 'A' + 1];
    
    for (char ch : wordArray) {
      counter[ch - 'A']++;
    }
    
    boolean multiMax = false;
    int max = -1;
    int maxIndex = -1;
    
    for (int i = 0; i < counter.length; i++) {
      if (counter[i] > max) {
      	multiMax = false;
        max = counter[i];
        maxIndex = i;
      } else if (counter[i] == max) {
        multiMax = true;
      }
    }
    
    System.out.println(multiMax ? "?" : (char) ('A' + maxIndex));
  }
}