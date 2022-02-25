import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine();
    int counter = 0;
    int length = input.length();
    
    for (int i = 0; i < length; i++) {
      if (i < length - 1) {
        switch (input.substring(i, i + 2)) {
          case "c=":
          case "c-":
          case "d-":
          case "lj":
          case "nj":
          case "s=":
          case "z=":
            i += 1;
            break;
          default:
        }
      }
      
      if (i < length - 2 && input.substring(i, i + 3).equals("dz=")) {
        i += 2;
      }
      
      counter++;
    }
    
    System.out.println(counter);
  }
}