import java.util.Scanner;

public class ExchangeCipher {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the plaintext string: ");
    String plainText = scanner.next().toUpperCase();
    scanner.close();

    int plainTextLen = plainText.length();

    System.out.print("The ciphertext string is: ");
    for (int charIdx = 0; charIdx < plainTextLen; charIdx++) {
      System.out.print((char) ('A' + 'Z' - plainText.charAt(charIdx)));
    }
  }
}
