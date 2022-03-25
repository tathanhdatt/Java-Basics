import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
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
    scanner.close();

    System.out.println("Array: " + Arrays.toString(array));
    reverse(array);
    System.out.println("After reverse: " + Arrays.toString(array));
  }
  public static void reverse( int[] array) {
    for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {
      int term = array[fIdx];
      array[fIdx] = array[bIdx];
      array[bIdx] = term;
    }
  }
}
