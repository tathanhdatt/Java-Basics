import java.util.Scanner;

public class PrintMethods {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of array: ");
    final int NUM_ARRAY = scanner.nextInt();

    double[] array = new double[NUM_ARRAY];

    if (array.length > 0) {
      System.out.print("Enter the value of all array (separated by space): ");
      for (int idx = 0; idx < array.length; idx++) {
        array[idx] = scanner.nextDouble();
      }
    }
    scanner.close();

    print(array);
  }

  public static void print(int[] array) {
    System.out.print("The values are: [");
    for (int idx = 0; idx < array.length; idx++) {
      if (idx == array.length - 1) {
        System.out.print(array[idx]);
      } else {
        System.out.print(array[idx] + ", ");
      }
    }
    System.out.println("]");
  }

  public static void print(double[] array) {
    System.out.print("The values are: [");
    for (int idx = 0; idx < array.length; idx++) {
      if (idx == array.length - 1) {
        System.out.print(array[idx]);
      } else {
        System.out.print(array[idx] + ", ");
      }
    }
    System.out.println("]");
  }

  public static void print(float[] array) {
    System.out.print("The values are: [");
    for (int idx = 0; idx < array.length; idx++) {
      if (idx == array.length - 1) {
        System.out.print(array[idx]);
      } else {
        System.out.print(array[idx] + ", ");
      }
    }
    System.out.println("]");
  }
}
