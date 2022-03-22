import java.util.Scanner;

public class TrigonometricSeries {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter x: ");
    double x = scanner.nextDouble();
    scanner.close();

    System.out.printf("My method: %.2f\n", sin(x, 10000000));
    System.out.printf("Math.sin(): %.2f\n", Math.sin(x));

    System.out.printf("My method: %.2f\n", cos(x, 10000000));
    System.out.printf("Math.cos(): %.2f\n", Math.cos(x));
  }

  public static double sin(double x, int numTerms) {
    double result = 0;
    double term = x;
    for (int i = 2; i <= numTerms; i++) {
      result += term;
      int bot = (i*2 - 1) * (i*2 - 2);
      term *= -1 * x * x / bot;
    }
    return  result;
  }

  public static double cos(double x, int numTerms) {
    double result = 0;
    double term = 1;
    for (int i = 1; i <= numTerms; i++) {
      result += term;
      int bot = (i*2 - 1) * (i*2);
      term *= -1 * x * x / bot;
    }
    return  result;
  }
}
