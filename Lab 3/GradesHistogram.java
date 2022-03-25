import java.util.Scanner;

public class GradesHistogram {
  public static int[] grades;
  public static int[] elementRange = new int[10];

  public static void main(String[] args) {
    readGrades();
    splitRange(grades);
    displayVertical();
    displayHorizontal();
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

  public static void splitRange(int[] array) {
    for (int element : array) {
      if (0 <= element && element <= 9) {
        elementRange[0]++;
      } else if (10 <= element && element <= 19) {
        elementRange[1]++;
      } else if (20 <= element && element <= 29) {
        elementRange[2]++;
      } else if (30 <= element && element <= 39) {
        elementRange[3]++;
      } else if (40 <= element && element <= 49) {
        elementRange[4]++;
      } else if (50 <= element && element <= 59) {
        elementRange[5]++;
      } else if (60 <= element && element <= 69) {
        elementRange[6]++;
      } else if (70 <= element && element <= 79) {
        elementRange[7]++;
      } else if (80 <= element && element <= 89) {
        elementRange[8]++;
      } else if (90 <= element && element <= 100) {
        elementRange[9]++;
      }
    }
  }

  public static void displayVertical() {
    int firstNum = 0;
    int lastNum = 9;
    for (int idx = 0; idx < elementRange.length; idx++) {
      System.out.printf("%2d - %2d: ", firstNum, lastNum);
      if (elementRange[idx] > 0) {
        for (int i = 0; i < elementRange[idx]; i++) {
          System.out.print("*");
        }
      }
      System.out.println();
      if (idx == elementRange.length - 1) {
        lastNum = 100;
      } else {
        firstNum += 10;
        lastNum += 10;
      }
    }
  }

  public static void displayHorizontal() {
    int maxRange = elementRange[0];
    for (int element : elementRange) {
      if (maxRange < element) {
        maxRange = element;
      }
    }

    while (maxRange > 0) {
      for (int idx = 0; idx < elementRange.length; idx++) {
        String blank = (idx == 0) ? " " : "  ";

        if (maxRange <= elementRange[idx]) {
          System.out.print(blank + "*" + blank);
        } else {
          System.out.print(blank + " " + blank);
        }

        System.out.print(" ");
      }
      --maxRange;

      System.out.println();
    }

    int firstNum = 0;
    int lastNum = 9;

    for (int idx = 0; idx < elementRange.length; idx++) {
      System.out.printf("%d-%d ", firstNum, lastNum);
      if (idx == elementRange.length - 1) {
        lastNum = 100;
      } else {
        firstNum += 10;
        lastNum += 10;
      }
    }
  }
}
