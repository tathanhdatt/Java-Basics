import java.util.Scanner;

public class Contains {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of array: ");
    final int NUM_ARRAY = scanner.nextInt();

    int[] array = new int[NUM_ARRAY];

    if (array.length > 0) {
      System.out.print("Enter the value of all array (separated by space): ");
      for (int idx = 0; idx < array.length; idx++) {
        array[idx] = scanner.nextInt();
      }
    }
    System.out.print("Enter the key: ");
    int key = scanner.nextInt();
    scanner.close();

    System.out.println(contains(array, key));
  }

  public static boolean contains(int[] array, int key) {
    for (int num : array) {
      if (num == key) {
        return true;
      }
    }
    return false;
  }
}
