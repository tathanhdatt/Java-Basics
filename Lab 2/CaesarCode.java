import java.util.Scanner;

public class CaesarCode {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the plaintext string: ");
    String plainText = scanner.next().toUpperCase();
    scanner.close();

    int plainTextLen = plainText.length();

    System.out.print("The ciphertext string is: ");
    for (int charIdx = 0; charIdx < plainTextLen; charIdx++) {
      if (plainText.charAt(charIdx) < 'X') {
        System.out.print((char) (plainText.charAt(charIdx) + 3));
      } else {
        System.out.print((char) (plainText.charAt(charIdx) - 23));
      }
    }
  }
}
