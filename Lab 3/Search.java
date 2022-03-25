import java.util.Scanner;

public class Search {
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

    if (search(array, key) > 0) {
      System.out.println("The index of " + key + " is " + search(array, key));
    } else {
      System.out.println("The array does not contain " + key);
    }
  }

  public static int search(int[] array, int key) {
    for (int idx = 0; idx < array.length; idx++) {
      if (array[idx] == key) {
        return idx;
      }
    }
    return -1;
  }
}
