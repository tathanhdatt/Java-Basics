public class Recursion {
  public static void main(String[] args) {
    System.out.println(factorial(3));
    System.out.println(fibonacci(3));
    System.out.println(lenOfNumSequence(12));
    System.out.println(gcd(13, 7));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static int lenOfNumSequence(int n) {
    int numOfDigits = 0;
    int i = n;

    while (i > 0) {
      i /= 10;
      numOfDigits++;
    }

    if (n < 10) {
      return n;
    } else {
      return lenOfNumSequence(n - 1) + numOfDigits;
    }
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }
}
