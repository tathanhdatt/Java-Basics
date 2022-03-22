import java.util.Scanner;

public class NumberGuess {
  public static void main(String[] args) {
    final int SECRET_NUMBER = (int) (Math.random() * 100);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Java NumberGuess");
    System.out.println("Key in your guess:");
    int numInput = scanner.nextInt();
    int numTrials = 1;

    while (numInput != SECRET_NUMBER) {
      if (numInput > SECRET_NUMBER) {
        System.out.println("Try lower");
      } else {
        System.out.println("Try higher");
      }
      numInput = scanner.nextInt();
      numTrials++;
    }

    scanner.close();

    System.out.println("You got it in " + numTrials + " trials!");
  }
}
