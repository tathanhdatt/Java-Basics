import java.util.Scanner;

public class PerfectNumberList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the upper bound: ");
    int upperBound = scanner.nextInt();
    scanner.close();

    int numPerfect = 0;
    System.out.println("These numbers perfect:");
    for (int num = 6; num <= upperBound; num++) {
      if (isPerfect(num)) {
        System.out.print(num + " ");
        numPerfect++;
      }
    }
    System.out.printf(
      "\n[%d perfect numbers found (%.2f%%)]\n",
      numPerfect, ((double)numPerfect / upperBound) * 100
    );

    int numNotDefAndNotPer = 0;
    System.out.println("These numbers are neither deficient nor perfect:");
    for (int num = 6; num <= upperBound; num++) {
      if (!isPerfect(num) && !isDeficient(num)) {
        System.out.print(num + " ");
        numNotDefAndNotPer++;
      }
    }
    System.out.printf(
      "\n[%d numbers found (%.2f%%)]\n",
      numNotDefAndNotPer, ((double)numNotDefAndNotPer / upperBound) * 100
    );
  }

  public static boolean isPerfect(int aPosInt) {
    int sumOfFactors = 0;
    for (int num = 1; num < aPosInt; num++) {
      if (aPosInt % num == 0) {
        sumOfFactors += num;
      }
    }
    return sumOfFactors == aPosInt;
  }

  public static boolean isDeficient(int aPosInt) {
    int sumOfFactors = 0;
    for (int num = 1; num < aPosInt; num++) {
      if (aPosInt % num == 0) {
        sumOfFactors += num;
      }
    }
    return sumOfFactors < aPosInt;
  }
}
