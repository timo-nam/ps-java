import java.util.Scanner;

public class Main {
  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int counter = 0;
    
    for (int i = 1; i <= n; i++) {
      if (Main.isHan(i)) {
        counter++;
      }
    }
    
    System.out.println(counter);
  }
  
  static boolean isHan(int value) {
    if (value >= 100) {
      char[] valueArray = String.valueOf(value).toCharArray();
      int difference = valueArray[1] - valueArray[0];
      
      for (int i = 1; i < valueArray.length - 1; i++) {
        int tmp = valueArray[i + 1] - valueArray[i];
        
        if (tmp != difference) {
          return false;
        }
      }
    }
    
    return true;
  }
}