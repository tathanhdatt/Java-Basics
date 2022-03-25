import java.util.Scanner;

public class SumProductMinMax5 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st integer: ");
		int number1 = sc.nextInt();
		System.out.print("Enter 2nd integer: ");
		int number2 = sc.nextInt();
		System.out.print("Enter 3rd integer: ");
		int number3 = sc.nextInt();
		System.out.print("Enter 4th integer: ");
		int number4 = sc.nextInt();
		System.out.print("Enter 5th integer: ");
		int number5 = sc.nextInt();
		sc.close();
		
		int sum = number1 + number2 + number3 + number4 + number5;
		int product = number1 * number2 * number3 * number4 * number5;

		int min = number1;
		if  (number2 < min ) {
			min = number2;
		}
		if (number3 < min) {
			min = number3;
		}
		if (number4 < min) {
			min = number4;
		}
		if (number5 < min) {
			min = number5;
		}

		int max = number1;
		if (number2 > max) {
			max = number2;
		}
		if (number3 > max) {
			max = number3;
		}
		if (number4 > max) {
			max = number4;
		}
		if (number5 > max) {
			max = number5;
		}
		
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The min is " + min);
		System.out.println("The max is " + max);
	}
}
