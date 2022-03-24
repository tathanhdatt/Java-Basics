import java.util.Scanner;

public class Matrices {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // input matrix 1
    System.out.println("-> Matrix 1");
    System.out.print("Enter the number of rows: ");
    int rows1 = scanner.nextInt();
    System.out.print("Enter the number of columns: ");
    int cols1 = scanner.nextInt();
    int[][] matrix1 = new int[rows1][cols1];

    for (int row = 0; row < rows1; row++) {
      System.out.print(
              "Enter " + cols1 + " elements of row " +
              (row + 1) + " (separated by space): "
      );
      for (int col = 0; col < cols1; col++) {
        matrix1[row][col] = scanner.nextInt();
      }
    }

    // input matrix 2
    System.out.println("-> Matrix 2");
    System.out.print("Enter the number of rows: ");
    int rows2 = scanner.nextInt();
    System.out.print("Enter the number of columns: ");
    int cols2 = scanner.nextInt();
    int[][] matrix2 = new int[rows2][cols2];

    for (int row = 0; row < rows2; row++) {
      System.out.print(
              "Enter " + cols2 + " elements of row " +
              (row + 1) + " (separated by space): "
      );
      for (int col = 0; col < cols2; col++) {
        matrix2[row][col] = scanner.nextInt();
      }
    }
    scanner.close();

    //print 2 matrices
    System.out.println("Matrix1");
    print(matrix1);
    System.out.println("Matrix2");
    print(matrix2);

    // test methods
    System.out.println("Sum of 2 matrices");
    print(add(matrix1, matrix2));

    System.out.println("Subtraction of 2 matrices");
    print(sub(matrix1, matrix2));

    System.out.println("Multiplication of 2 matrices");
    print(multiplication(matrix1, matrix2));
  }
  public static void print(int[][] matrix) {
    if (matrix == null) {
      return;
    }
    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int row = 0; row < rows; row++) {
      System.out.print("[");
      for (int col = 0; col < cols; col++) {
        if (col != cols - 1){
          System.out.print(matrix[row][col] + ", ");
        } else {
          System.out.print(matrix[row][col]);
        }
      }
      System.out.println("]");
    }
  }

  public static void print(double[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int row = 0; row < rows; row++) {
      System.out.print("[ ");
      for (int col = 0; col < cols; col++) {
        System.out.print(matrix[row][col] + ", ");
      }
      System.out.println("]");
    }
  }

  public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
    return matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length;
  }

  public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
    return matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length;
  }

  public static int[][] add(int[][] matrix1, int[][] matrix2) {
    if (haveSameDimension(matrix1, matrix2)) {
      System.out.println("2 matrices don't have the same dimension");
      return null;
    }

    int rows = matrix1.length;
    int cols = matrix1.length;
    int[][] sumMatrix = new int[rows][cols];

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        sumMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
      }
    }

    return sumMatrix;
  }

  public static double[][] add(double[][] matrix1, double[][] matrix2) {
    if (haveSameDimension(matrix1, matrix2)) {
      System.out.println("2 matrices don't have the same dimension");
      return null;
    }

    int rows = matrix1.length;
    int cols = matrix1.length;
    double[][] sumMatrix = new double[rows][cols];

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        sumMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
      }
    }

    return sumMatrix;
  }

  public static int[][] sub(int[][] matrix1, int[][] matrix2) {
    if (haveSameDimension(matrix1, matrix2)) {
      System.out.println("2 matrices don't have the same dimension");
      return null;
    }

    int rows = matrix1.length;
    int cols = matrix1.length;
    int[][] subMatrix = new int[rows][cols];

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        subMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
      }
    }

    return subMatrix;
  }

  public static double[][] sub(double[][] matrix1, double[][] matrix2) {
    if (haveSameDimension(matrix1, matrix2)) {
      System.out.println("2 matrices don't have the same dimension");
      return null;
    }

    int rows = matrix1.length;
    int cols = matrix1.length;
    double[][] subMatrix = new double[rows][cols];

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        subMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
      }
    }

    return subMatrix;
  }

  public static int[][] multiplication(int[][] matrix1, int[][] matrix2) {
    if (matrix1[0].length != matrix2.length) {
      System.out.println(
        "the number of columns matrix 1 and the number of rows matrix 2 don't same"
      );
      return null;
    }

    int rows = matrix1.length;
    int cols = matrix2[0].length;
    int[][] mulMatrix = new int[rows][cols];

    for (int rowIdx = 0; rowIdx < rows; rowIdx++) {
      for (int colIdx = 0; colIdx < cols; colIdx++) {
        int element = 0;
        int numColMatrix1 = matrix1[0].length;

        for (int idx = 0; idx < numColMatrix1; idx++) {
          element += matrix1[rowIdx][idx] * matrix2[idx][colIdx];
        }

        mulMatrix[rowIdx][colIdx] = element;
      }
    }
    return mulMatrix;
  }

  public static double[][] multiplication(double[][] matrix1, double[][] matrix2) {
    if (matrix1[0].length != matrix2.length) {
      System.out.println(
        "the number of columns matrix 1 and the number of rows matrix 2 don't same"
      );
      return null;
    }

    int rows = matrix1.length;
    int cols = matrix2[0].length;
    double[][] mulMatrix = new double[rows][cols];

    for (int rowIdx = 0;rowIdx < rows; rowIdx++) {
      for (int colIdx = 0 ;colIdx < cols; colIdx++) {
        double element = 0;
        int numColMatrix1 = matrix1[0].length;

        for (int idx = 0; idx < numColMatrix1; idx++) {
          element += matrix1[rowIdx][idx] * matrix2[idx][colIdx];
        }

        mulMatrix[rowIdx][colIdx] = element;
      }
    }
    return mulMatrix;
  }
}