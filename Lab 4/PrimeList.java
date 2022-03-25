import java.util.Scanner;

public class PrimeList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the upper bound: ");
    int upperBound = scanner.nextInt();
    scanner.close();

    int numPrime = 0;
    for (int num = 1; num <= upperBound; num++) {
      if (isPrime(num)) {
        System.out.println(num);
        numPrime++;
      }
    }
    System.out.printf(
      "[%d primes found (%.2f%%)]",
      numPrime, ((double)numPrime / upperBound) * 100
    );
  }

  public static boolean isPrime(int aPosInt) {
    for (int num = 2; num <= Math.sqrt(aPosInt); num++) {
      if (aPosInt % num == 0) return false;
    }
    return true;
  }
}
