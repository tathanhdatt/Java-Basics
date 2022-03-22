import java.util.Scanner;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number 1: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter the number 2: ");
    int num2 = scanner.nextInt();
    scanner.close();

    System.out.println("The greatest common divisor is " + gcd(num1, num2));
  }

  public static int gcd(int a, int b) {
    while (b != 0) {
      int term = b;
      b = a % b;
      a = term;
    }
    return a;
  }
}
