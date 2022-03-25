import java.util.Scanner;

public class RadixN2Dec {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radix: ");
    int radix = scanner.nextInt();
    System.out.print("Enter the string: ");
    String str = scanner.next();
    scanner.close();

    int strLen = str.length();

    if (radix <= 10) {
      int decNum = 0;
      int num = Integer.parseInt(str);

      for (int index = 0; index < strLen; index++) {
        decNum += Math.pow(radix, index) * (num % 10);
        num /= 10;
      }

      System.out.printf(
              "The equivalent decimal \"%s\" is: %d",
              str,
              decNum
      );
    } else {
      String lowerStr = str.toLowerCase();
      int decNum = 0;

      for (int index = 0; index < strLen; index++) {
        char inChar = lowerStr.charAt(strLen - index - 1);

        if (inChar >= '0' && inChar <= '9') {
          decNum += Math.pow(radix, index) * Character.getNumericValue(inChar);
        } else {
          decNum += Math.pow(radix, index) * (inChar - 87);
        }
      }

      System.out.printf(
              "The equivalent decimal number \"%s\" is: %d",
              str,
              decNum
      );
    }
  }
}
