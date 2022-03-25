import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args){
		int number;
		boolean isValid = false;

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter the number between 0-10 or 90-100: ");
			number = sc.nextInt();

			if ((number >= 0 && number <= 10) || (number >= 90 && number <= 100)) {
				isValid = true;
			} else {
				System.out.println("Invalid input, try again...");
			}
		} while (!isValid);

		sc.close();
		System.out.println("You have entered: " + number);
	}
}
