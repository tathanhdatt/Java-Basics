import java.util.Scanner;

public class HillPatternB {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the rows: ");
    int numRows = scanner.nextInt();
    scanner.close();

    int numCols = numRows * 2 - 1;

    for (int row = 1; row <= numRows; row++) {
      for (int col = 1; col <= numCols; col++) {
        if (row <= col && col <= numCols - row + 1) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
