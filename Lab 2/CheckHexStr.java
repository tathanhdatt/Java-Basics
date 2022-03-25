import java.util.Scanner;

public class CheckHexStr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a hex string: ");
    String hexStr = scanner.nextLine();
    int hexStrLen = hexStr.length();
    scanner.close();

    boolean isHexStr = true;

    for (int charIdx = 0; charIdx < hexStrLen; charIdx++) {
      char inChar = hexStr.charAt(charIdx);

      if (
        !(
          ((inChar >= '0') && (inChar <= '9')) ||
          ((inChar >= 'a') && (inChar <= 'f')) ||
          ((inChar >= 'A') && (inChar <= 'F'))
        )
      ) {
        isHexStr = false;
        break;
      }
    }

    if (isHexStr) {
      System.out.printf("\"%s\" is a hex string", hexStr);
    } else {
      System.out.printf("\"%s\" is not a hex string", hexStr);
    }
  }
}
