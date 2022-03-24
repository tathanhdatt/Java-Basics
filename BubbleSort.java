import java.util.Scanner;

public class BubbleSort {
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

    System.out.print("Original array: ");
    System.out.println(arrayToString(array));

    bubbleSort(array);

    System.out.print("Sorted array: ");
    System.out.println(arrayToString(array));

  }

  public static void bubbleSort(int[] array) {
    int n = array.length;
    boolean swapped;
    do {
      swapped = false;
      for (int i = 1; i < n; i++) {
        if (array[i] < array[i - 1]) {
          int term = array[i];
          array[i] = array[i - 1];
          array[i - 1] = term;
          swapped = true;
        }
      }
      n = n - 1;
    } while (swapped);
  }

  public static String arrayToString(int[] array) {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int element : array) {
      str.append(element);
      if (element != array[array.length - 1]) {
        str.append(", ");
      }
    }
    str.append("]");
    return str.toString();
  }
}
