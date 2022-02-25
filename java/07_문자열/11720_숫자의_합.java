import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String n = scanner.nextLine();
    char[] numbers = scanner.nextLine().toCharArray();
    int sum = 0;
    
    for (char digit : numbers) {
      sum += digit - '0';
    }
    
    System.out.println(sum);
  }
}