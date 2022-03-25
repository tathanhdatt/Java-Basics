import java.util.Scanner;

public class GradesStatistics {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int numStudents = scanner.nextInt();

    int[] grades = new int[numStudents];

    for (int studentNo = 1; studentNo <= numStudents; studentNo++) {
      System.out.print("Enter grade for student " + studentNo + ": ");
      grades[studentNo - 1] = scanner.nextInt();
    }
    scanner.close();

    double average = 0;
    int minimum = grades[0];
    int maximum = grades[0];
    for (int grade : grades) {
      average += grade;
      if (grade > maximum) maximum = grade;
      if (grade < minimum) minimum = grade;
    }
    average /= grades.length;

    System.out.printf("The average is: %.2f\n", average);
    System.out.println("The minimum is: " + minimum);
    System.out.println("The maximum is: " + maximum);
  }
}
