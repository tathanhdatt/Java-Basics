import java.util.Scanner;

public class Bin2Dec {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a binary string: ");
    String binaryStr = scanner.next();
    scanner.close();

    int binaryStrLen = binaryStr.length();
    boolean isBinaryStr = true;

    for (int index = 0; index < binaryStrLen; index++) {
      char inChar = binaryStr.charAt(index);

      if (inChar != '0' && inChar != '1') {
        isBinaryStr = false;
        break;
      }
    }

    if (isBinaryStr) {
      int decNum = 0;
      int binaryNum = Integer.parseInt(binaryStr);

      for (int index = 0; index < binaryStrLen; index++) {
        decNum += Math.pow(2, index) * (binaryNum % 10);
        binaryNum /= 10;
      }

      System.out.printf(
              "The equivalent decimal number for binary \"%s\" is: %d",
              binaryStr,
              decNum
      );
    } else {
      System.out.printf("error: invalid binary string \"%s\"", binaryStr);
    }
  }
}
