import java.util.Scanner;

public class NumberConversion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number and radix: ");
    String inStr = scanner.next();
    System.out.print("Enter the input radix: ");
    int inRadix = scanner.nextInt();
    System.out.print("Enter the output radix: ");
    int outRadix = scanner.nextInt();
    scanner.close();

    System.out.printf(
            "\"%s\" in radix %d is \"%s\" in radix %d",
            inStr,
            inRadix,
            toRadix(inStr, inRadix, outRadix),
            outRadix
    );
  }

  public static String toRadix(String inStr, int inRadix, int outRadix) {
    inStr = inStr.toUpperCase();

    // convert input radix to decimal
    int numDec = 0;
    int idx = 0;
    while (idx < inStr.length()) {
      char inChar = inStr.charAt(inStr.length() - idx - 1);
      if ('0' <= inChar && inChar <= '9') {
        numDec += Math.pow(inRadix, idx) * Character.getNumericValue(inChar);
      } else {
        numDec += Math.pow(inRadix, idx) * (inChar - 55);
      }
      idx++;
    }

    if (outRadix == 10 ) {
      return String.valueOf(numDec);
    }

    //convert decimal to output radix
    StringBuilder result = new StringBuilder();
    while (numDec > 0) {
      int term = numDec % outRadix;
      if (term <= 9) {
        result.insert(0, term);
      } else {
        result.insert(0, (char) (term + 55));
      }
      numDec /= outRadix;
    }
    return result.toString();
  }
}
