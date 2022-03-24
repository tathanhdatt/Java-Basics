import java.util.Scanner;

public class SelectionSort {
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

    selectionSort(array);

    System.out.print("Sorted array: ");
    System.out.println(arrayToString(array));

  }

  public static void selectionSort(int[] array) {
    int flag = 0;
    do {
      // find index of min element from flag to end array
      int termIdx = flag;
      for (int i = flag; i < array.length; i++) {
        if (array[termIdx] > array[i]) {
          termIdx = i;
        }
      }
      // swap min element with element at flag
      int term = array[termIdx];
      array[termIdx] = array[flag];
      array[flag] = term;
      flag++;
    } while (flag < array.length);
  }

  public static String arrayToString(int[] array) {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int element : array) {
      if (element == array[array.length - 1]) {
        str.append(element);
      } else {
        str.append(element).append(", ");
      }
    }
    str.append("]");
    return str.toString();
  }
}
