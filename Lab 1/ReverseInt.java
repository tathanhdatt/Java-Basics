import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		sc.close();

		System.out.print("The reverse is: ");
		while (number > 0) {
			int inDigit = number % 10;
			System.out.print(inDigit);
			number /= 10;
		}
	}
}
