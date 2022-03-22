public class FibonacciInt {
  public static void main(String[] args) {
    fibonacciInt();
  }

  public static void fibonacciInt() {
    int n = 0;
    int fnMinus1 = 1;
    int fnMinus2 = 1;
    int fn;

    System.out.println("F(" + n + ") = " + fnMinus1);
    n++;
    System.out.println("F(" + n + ") = " + fnMinus2);

    while (Integer.MAX_VALUE - fnMinus1 > fnMinus2) {
      n++;
      fn = fnMinus1 + fnMinus2;
      System.out.println("F(" + n + ") = " + fn);
      fnMinus1 = fnMinus2;
      fnMinus2 = fn;
    }
    System.out.println("F(" + (n + 1) + ") is out of range of int");
  }
}
