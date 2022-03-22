public class Factorial {
  public static void main(String[] args) {
    printFactorialInt();
    printFactorialLong();
  }

  public static void printFactorialInt() {
    int n = 0;
    while (Integer.MAX_VALUE / factorialInt(n) > n + 1) {
      n++;
      System.out.println("The factorial of " + n + " is " + factorialInt(n));
    }
    System.out.println("The factorial of " + (n + 1) + " is out of range");
  }

  public static int factorialInt(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void printFactorialLong() {
    long n = 0;
    while (Long.MAX_VALUE / factorialLong(n) > n + 1) {
      n++;
      System.out.println("The factorial of " + n + " is " + factorialLong(n));
    }
    System.out.println("The factorial of " + (n + 1) + " is out of range");
  }

  public static long factorialLong(long n) {
    long result = 1;
    for (long i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}
