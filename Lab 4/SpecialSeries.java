import java.util.Scanner;

public class SpecialSeries {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter x: ");
    double x = scanner.nextDouble();
    scanner.close();

    System.out.println(specialSeries(x, 1000));
  }
  public static double specialSeries(double x, int numTerms) {
    double result = 0;
    double term = x;
    for (int i = 1; i < numTerms; i++) {
      result += term;
      double num = (double) (2*i - 1) / (2*i);
      term += num * x * x / (2*i + 1);
    }
    return result;
  }
}
