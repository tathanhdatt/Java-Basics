import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics2 {
  public static int[] grades;

  public static void main(String[] args) {
    readGrades();
    System.out.print("The grades are: ");
    print(grades);
    System.out.printf("The average is %.2f\n", average(grades));
    System.out.printf("The median is %.2f\n", median(grades));
    System.out.println("The minimum is " + minimum(grades));
    System.out.println("The maximum is " + maximum(grades));
    System.out.printf("The standard deviation is %.2f\n", stdDev(grades));
  }

  public static void readGrades() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int numStudents = scanner.nextInt();

    grades = new int[numStudents];

    for (int studentNo = 1; studentNo <= numStudents; studentNo++) {
      System.out.print("Enter grade for student " + studentNo + ": ");
      grades[studentNo - 1] = scanner.nextInt();
    }
    scanner.close();
  }

  public static void print(int[] array) {
    System.out.print("[");
    for (int idx = 0; idx < array.length; idx++) {
      if (idx == array.length - 1) {
        System.out.print(array[idx]);
      } else {
        System.out.print(array[idx] + ", ");
      }
    }
    System.out.println("]");
  }

  public static double average(int[] array) {
    double sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum / array.length;
  }

  public static double median(int[] array) {
    Arrays.sort(array);
    int arrLen = array.length;
    if (arrLen % 2 == 0) {
      double centerElement1 = array[arrLen / 2];
      double centerElement2 = array[arrLen / 2 - 1];
      return (centerElement1 + centerElement2) / 2;
    } else {
      return array[arrLen / 2];
    }
  }

  public static int minimum(int[] array) {
    int min = array[0];
    for (int element : array) {
      if (element < min) {
        min = element;
      }
    }
    return min;
  }

  public static int maximum(int[] array) {
    int max = array[0];
    for (int element : array) {
      if (element > max) {
        max = element;
      }
    }
    return max;
  }

  public static double stdDev(int[] array) {
    double stdDev = 0;
    for (int element : array) {
      stdDev += element * element;
    }
    stdDev = Math.sqrt(stdDev/array.length - average(array) * average(array));

    return stdDev;
  }
}
