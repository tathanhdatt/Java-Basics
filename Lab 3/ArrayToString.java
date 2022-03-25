import java.util.Scanner;

public class ArrayToString {
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

    System.out.println(arrayToString(array));
  }

  public static String arrayToString(int[] array) {
    StringBuilder str = new StringBuilder();
    for (int element : array) {
      str.append(element);
    }
    return str.toString();
  }
}
