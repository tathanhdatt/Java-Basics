import java.util.Scanner;

public class TimeTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size (a positive integer): ");
    int size = scanner.nextInt();
    scanner.close();

    for (int row = 0; row <= size; row++) {
      if (row == 0) {
        System.out.print(" * |");
      } else {
        System.out.printf("%2d |", row);
      }

      for (int col = 1; col <= size; col++) {
        if (row == 0) {
          System.out.printf("%4d", col);
        } else {
          System.out.printf("%4d", col * row);
        }
      }
      System.out.println();

      if (row == 0) {
        for (int term = 0; term <= size; term++) {
          if (term == 0) {
            System.out.print(" ---");
          } else {
            System.out.print("----");
          }
        }
        System.out.println();
      }
    }
  }
}
