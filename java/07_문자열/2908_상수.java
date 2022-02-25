import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int reverseA = 0;
    int reverseB = 0;
    
    int n = 100;
    while (n > 0) {
      reverseA += (a % 10) * n;
      reverseB += (b % 10) * n;
      
      a /= 10;
      b /= 10;
      
      n /= 10;
    }
    
    System.out.println((reverseA > reverseB) ? reverseA : reverseB);
  }
}