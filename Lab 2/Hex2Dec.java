import java.util.Scanner;

public class Hex2Dec {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a hexadecimal string: ");
    String hexStr = scanner.next();
    scanner.close();

    int hexStrLen = hexStr.length();
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
      String lowerHexStr = hexStr.toLowerCase();
      int decNum = 0;

      for (int index = 0; index < hexStrLen; index++) {
        char inChar = lowerHexStr.charAt(hexStrLen - index - 1);

        if (inChar >= '0' && inChar <= '9') {
          decNum += Math.pow(16, index) * Character.getNumericValue(inChar);
        } else {
          decNum += Math.pow(16, index) * (inChar - 87);
        }
      }

      System.out.printf(
              "The equivalent decimal number for hexadecimal \"%s\" is: %d",
              hexStr,
              decNum
      );
    } else {
      System.out.printf("error: invalid hexadecimal string \"%s\"", hexStr);
    }
  }
}
