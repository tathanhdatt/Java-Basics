import java.util.Scanner;

public class HillPatternD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the rows: ");
    int numRows = scanner.nextInt();
    scanner.close();

    int numCols = 2 * numRows - 1;

    for (int row = 1; row <= 2 * numRows - 1; row++) {
      if (row <= numRows) {
        for (int col = 1; col <= numCols; col++) {
          if (row + col > numRows + 1 && row > col - numRows + 1) {
            System.out.print("  ");
          } else {
            System.out.print("# ");
          }
        }
        System.out.println();
      } else {
        for (int col = 1; col <= numCols; col++) {
          if (row - numRows < col - 1 && col < numCols - row + numRows) {
            System.out.print("  ");
          } else {
            System.out.print("# ");
          }
        }
        System.out.println();
      }
    }
  }
}
