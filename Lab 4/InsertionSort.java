import java.util.Scanner;

public class InsertionSort {
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

    insertionSort(array);

    System.out.print("Sorted array: ");
    System.out.println(arrayToString(array));

  }

  public static void insertionSort(int[] array) {
    int flag = 1;
    while (flag < array.length){
      int element = array[flag];
      // find position on the left for element
      for (int i = 0; i < flag; i++) {
        if (element < array[i]) {
          // move elements on the left of flag up 1 position
          for (int j = flag; j > i; j--) {
            array[j] = array[j - 1];
          }
          array[i] = element;
          break;
        }
      }
      flag++;
    }
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
