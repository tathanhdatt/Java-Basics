import java.util.Scanner;

public class PrintArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of items: ");
    final int NUM_ITEMS = scanner.nextInt();

    int[] items = new int[NUM_ITEMS];

    if (items.length > 0) {
      System.out.print("Enter the value of all items (separated by space): ");
      for (int idx = 0; idx < items.length; idx++) {
        items[idx] = scanner.nextInt();
      }
    }
    scanner.close();

    System.out.print("The values are: [");
    for (int idx = 0; idx < items.length; idx++) {
      if (idx == items.length - 1) {
        System.out.print(items[idx]);
      } else {
        System.out.print(items[idx] + ", ");
      }
    }
    System.out.print("]");
  }
}
