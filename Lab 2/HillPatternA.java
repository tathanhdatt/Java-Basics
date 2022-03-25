import java.util.Scanner;

public class HillPatternA {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the rows (a non-negative integer): ");
    int numRows = scanner.nextInt();
    scanner.close();

    int numCols = 2 * numRows - 1;

    for (int row = 1; row <= numRows; row++) {
      for (int col = 1; col <= numCols; col++) {
        if (row + col >= numRows + 1 && row >= col - numRows + 1) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
