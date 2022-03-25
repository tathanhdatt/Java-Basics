import java.util.Scanner;

public class Oct2Dec {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a octal string: ");
    String octStr = scanner.next();
    scanner.close();

    int octStrLen = octStr.length();
    int decNum = 0;
    int numOct = Integer.parseInt(octStr);

    for (int index = 0; index < octStrLen; index++) {
      decNum += Math.pow(8, index) * (numOct % 10);
      numOct /= 10;
    }

    System.out.printf(
            "The equivalent decimal number \"%s\" is: %d",
            octStr,
            decNum
    );
  }
}
