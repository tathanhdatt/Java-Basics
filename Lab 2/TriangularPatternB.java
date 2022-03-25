import java.util.Scanner;

public class TriangularPatternB {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size (a non-negative integer): ");
    int size = scanner.nextInt();
    scanner.close();

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (row + col <= size + 1) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
