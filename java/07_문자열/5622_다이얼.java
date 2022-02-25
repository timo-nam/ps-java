import java.util.Scanner;

public class Main {
  static int[] alphabetToNumber = new int[] {
    2, 2, 2,    // A, B, C,
    3, 3, 3,    // D, E, F,
    4, 4, 4,    // G, H, I,
    5, 5, 5,    // J, K, L,
    6, 6, 6,    // M, N, O,
    7, 7, 7, 7, // P, Q, R, S,
    8, 8, 8,    // T, U, V,
    9, 9, 9, 9  // W, X, Y, Z
  };
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] wordArray = scanner.nextLine().toCharArray();
    int sum = 0;
    
    for (char ch : wordArray) {
      sum += Main.alphabetToNumber[ch - 'A'] + 1;
    }
    
    System.out.println(sum);
  }
}