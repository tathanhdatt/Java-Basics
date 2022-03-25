import java.util.Scanner;

public class PerfectPrimeFactorList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the upper bound: ");
    int upperBound = scanner.nextInt();
    scanner.close();

    System.out.println("These numbers are equal to the product of prime factors:");

    int numPerfectPrime = 0;
    for (int num = 1; num <= upperBound; num++) {
      if (isProductOfPrimeFactors(num)) {
        System.out.print(num + " ");
        numPerfectPrime++;
      }
    }
    System.out.printf(
      "\n[%d found (%.2f%%)]",
      numPerfectPrime, ((double)numPerfectPrime / upperBound) * 100
    );
  }

  public static boolean isProductOfPrimeFactors(int aPosInt) {
    int productOfPrimeFactor = 1;
    for (int num = 1; num < aPosInt; num++) {
      if (aPosInt % num == 0 && isPrime(num)) {
        productOfPrimeFactor *= num;
      }
    }
    return productOfPrimeFactor == aPosInt;
  }


  public static boolean isPrime(int aPosInt) {
    for (int num = 2; num <= Math.sqrt(aPosInt); num++) {
      if (aPosInt % num == 0) return false;
    }
    return true;
  }
}
