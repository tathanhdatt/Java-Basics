import java.util.Arrays;
import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of array 1: ");
    final int NUM_ARRAY1 = scanner.nextInt();
    System.out.print("Enter the number of array 2: ");
    final int NUM_ARRAY2 = scanner.nextInt();

    int[] array1 = new int[NUM_ARRAY1];
    int[] array2 = new int[NUM_ARRAY2];

    if (array1.length > 0) {
      System.out.print("Enter the value of all array 1 (separated by space): ");
      for (int idx = 0; idx < array1.length; idx++) {
        array1[idx] = scanner.nextInt();
      }
    }
    if (array2.length > 0) {
      System.out.print("Enter the value of all array 2 (separated by space): ");
      for (int idx = 0; idx < array2.length; idx++) {
        array2[idx] = scanner.nextInt();
      }
    }
    scanner.close();

    System.out.println("Array 1: " + Arrays.toString(array1));
    System.out.println("Array 2: " + Arrays.toString(array2));
    if (swap(array1, array2)) {
      System.out.println("After swap");
      System.out.println("Array 1: " + Arrays.toString(array1));
      System.out.println("Array 2: " + Arrays.toString(array2));
    } else {
      System.out.println("Can not swap");
    }
  }

  public static boolean swap(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int idx = 0; idx < array1.length; idx++) {
      int term = array1[idx];
      array1[idx] = array2[idx];
      array2[idx] = term;
    }

    return true;
  }
}
