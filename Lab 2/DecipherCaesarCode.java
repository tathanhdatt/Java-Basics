import java.util.Scanner;

public class DecipherCaesarCode {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the ciphertext string: ");
    String plainText = scanner.next().toUpperCase();
    scanner.close();

    int plainTextLen = plainText.length();

    System.out.print("The plaintext string is: ");
    for (int charIdx = 0; charIdx < plainTextLen; charIdx++) {
      if (plainText.charAt(charIdx) > 'C') {
        System.out.print((char) (plainText.charAt(charIdx) - 3));
      } else {
        System.out.print((char) (plainText.charAt(charIdx) + 23));
      }
    }
  }
}
