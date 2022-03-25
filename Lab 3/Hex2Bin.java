import java.util.Scanner;

public class Hex2Bin {
  public static void main(String[] args) {
    final String[] HEX_BITS = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
    };

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a hexadecimal string: ");
    String hexStr = scanner.next();
    scanner.close();

    System.out.printf(
            "The equivalent binary for hexadecimal \"%s\" is: ",
            hexStr
    );
    String hexStrLower = hexStr.toLowerCase();
    for (int strIdx = 0; strIdx < hexStrLower.length(); strIdx++) {
      char hexChar = hexStrLower.charAt(strIdx);
      if(Character.isDigit(hexChar)) {
        System.out.print(
                HEX_BITS[Character.getNumericValue(hexChar)] + " "
        );
      } else {
        System.out.print(HEX_BITS[hexChar - 87] + " ");
      }
    }
  }
}
