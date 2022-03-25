public class TribonacciInt {
  public static void main(String[] args) {
    tribonacciInt();
  }
  public static void tribonacciInt() {
    int n = 0;
    int tnMinus1 = 1;
    int tnMinus2 = 1;
    int tnMinus3 = 2;
    int tn;

    System.out.println("F(" + n + ") = " + tnMinus1);
    n++;
    System.out.println("F(" + n + ") = " + tnMinus2);
    n++;
    System.out.println("F(" + n + ") = " + tnMinus3);

    while (Integer.MAX_VALUE - tnMinus1 - tnMinus2 > tnMinus3) {
      n++;
      tn = tnMinus1 + tnMinus2 + tnMinus3;
      System.out.println("F(" + n + ") = " + tn);
      tnMinus1 = tnMinus2;
      tnMinus2 = tnMinus3;
      tnMinus3 = tn;
    }
    System.out.println("F(" + (n + 1) + ") is out of range of int");
  }
}
