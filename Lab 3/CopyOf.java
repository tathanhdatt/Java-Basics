import java.util.Scanner;

public class CopyOf {
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

    copyOf(array, 10);
  }

  public static int[] copyOf(int[] array) {
    int[] newArray = new int[array.length];
    for (int idx = 0; idx < array.length; idx++) {
      newArray[idx] = array[idx];
    }
    return newArray;
  }

  public static int[] copyOf(int[] array, int length) {
    int[] newArray;

    if (length <= array.length) {
      newArray = new int[length];
      for (int idx = 0; idx < array.length; idx++) {
        newArray[idx] = array[idx];
      }
    } else {
      newArray = new int[length];

      for (int idx = 0; idx < length; idx++) {
        if (idx < array.length) {
          newArray[idx] = array[idx];
        } else {
          newArray[idx] = 0;
        }
      }
    }
    return newArray;
  }
}
