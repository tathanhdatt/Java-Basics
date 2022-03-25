import java.util.Scanner;

public class SquarePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size (a non-negative integer): ");
    int size = scanner.nextInt();
    scanner.close();

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        System.out.print("# ");
      }
      System.out.println();
    }

    System.out.println();

    rewriteUsingWhileDoLoop(size);
  }

  public static void rewriteUsingWhileDoLoop(int size) {
    int row = 1;
    do {
      int col = 1;
      do {
        System.out.print("# ");
        col++;
      } while (col <= size);

      System.out.println();
      row++;
    } while (row <= size);
  }
}
