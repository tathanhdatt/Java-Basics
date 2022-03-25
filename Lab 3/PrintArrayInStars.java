import java.util.Scanner;

public class PrintArrayInStars {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of items: ");
    final int NUM_ARRAY = scanner.nextInt();

    int[] items = new int[NUM_ARRAY];

    if (items.length > 0) {
      System.out.print("Enter the value of all items (separated by space): ");
      for (int idx = 0; idx < items.length; idx++) {
        items[idx] = scanner.nextInt();
      }
    }
    scanner.close();

    for (int idx = 0; idx < items.length; idx++) {
      System.out.print(idx + ": ");
      for (int starNo = 1; starNo <= items[idx]; starNo++) {
        System.out.print("*");
      }
      System.out.println("(" + items[idx] + ")");
    }
  }
}
