import java.util.Scanner;

public class BoxPatternD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size (a non-negative integer): ");
    int size = scanner.nextInt();
    scanner.close();

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (row == 1 || row == size || col == size - row + 1|| col == row){
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
