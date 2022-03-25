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
        // Convert to decimal
        int decimal = Integer.parseInt(inStr, inRadix);
        // Convert to radix
        return Integer.toString(decimal, outRadix);
  }
}
