import java.util.Scanner;

public class Dec2Hex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int decNum = scanner.nextInt();
    scanner.close();

    StringBuilder hexStr = new StringBuilder();
    while (decNum > 0) {
      int hexNum = decNum % 16;
      if(hexNum < 10) {
        hexStr.insert(0, hexNum);
      } else {
        hexStr.insert(0, (char) (hexNum + 55));
      }
      decNum /= 16;
    }
    System.out.print("The equivalent hexadecimal number is " + hexStr);
  }
}
