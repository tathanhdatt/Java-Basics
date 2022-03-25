import java.util.Scanner;

public class AverageWithInputValidation {

	public static void main(String[] args){
		
		final int NUM_STUDENTS = 3;

		boolean isValid = false;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
			do {
				System.out.printf("Enter the mark (0 - 100) for student %d: ", studentNo);
				int numberIn = sc.nextInt();

				if (numberIn >= 0 && numberIn <= 100) {
					isValid = true;
					sum += numberIn;
				} else {
					System.out.println("Invalid input, try again...");
				}
			} while (!isValid);
		}
		sc.close();

		double average = (double)sum/NUM_STUDENTS;
		System.out.printf("The average is %.2f\n", average);
	}
}
