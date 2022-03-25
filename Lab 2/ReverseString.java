import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inStr = scanner.next();
    scanner.close();

    int inStrLen = inStr.length();

    for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
      System.out.print(inStr.charAt(charIdx));
    }
  }
}
