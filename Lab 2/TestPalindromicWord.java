import java.util.Scanner;

public class TestPalindromicWord {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = scanner.next();
    scanner.close();

    int wordLen = word.length();
    int fIdx = 0;
    int bIdx = wordLen - 1;
    boolean isPalindromicWord = true;

    while (fIdx < bIdx) {
      String lowerWord = word.toLowerCase();

      if (lowerWord.charAt(fIdx) != lowerWord.charAt(bIdx)) {
        isPalindromicWord = false;
        break;
      }
      ++fIdx;
      --bIdx;
    }

    if (isPalindromicWord) {
      System.out.printf("\"%s\" is a palindrome", word);
    } else {
      System.out.printf("\"%s\" is not a palindrome", word);
    }
  }
}
