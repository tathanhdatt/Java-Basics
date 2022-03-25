import java.util.Scanner;

public class TestPalindromicPhrase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();
    scanner.close();

    int strLen = str.length();
    int fIdx = 0;
    int bIdx = strLen - 1;
    boolean isPalindromicWord = true;
    String lowerStr = str.toLowerCase();

    while (fIdx < bIdx) {
      if (Character.isLetter(lowerStr.charAt(fIdx))) {
        if (Character.isLetter(lowerStr.charAt(bIdx))) {
          if (lowerStr.charAt(fIdx) != lowerStr.charAt(bIdx)) {
            isPalindromicWord = false;
            break;
          }
          ++fIdx;
        }
        --bIdx;
      } else {
        ++fIdx;
      }
    }

    if (isPalindromicWord) {
      System.out.printf("\"%s\" is a palindrome", str);
    } else {
      System.out.printf("\"%s\" is not a palindrome", str);
    }
  }
}
