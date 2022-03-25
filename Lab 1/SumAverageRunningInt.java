public class SumAverageRunningInt {
	public static void main(String[] args){
		final int LOWER_BOUND = 1;
		final int UPPER_BOUND = 100;
		int sum = 0;
		double average = 0;
		int length = UPPER_BOUND - LOWER_BOUND + 1;

		//1)
		int number = LOWER_BOUND;
		while (number <= UPPER_BOUND) {
			sum += number;
			number++;
		}

		average = (double)sum/length;
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
		
		//4)
		int count = 0;
		for (int i = LOWER_BOUND; i < UPPER_BOUND; i++) {
			++count;
		}

		average = (double)sum/count;

		//5)
		int sumOfTheSquares = 0;
		for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
			sumOfTheSquares += i*i;
		}

		System.out.println("The sum of the squares is " + sumOfTheSquares);

		//6)
		int sumOdd = 0;
		int sumEven = 0;
		int absDiff;
		for (int i = LOWER_BOUND; i < UPPER_BOUND; i++) {
			if (i%2==0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		absDiff = (sumOdd < sumEven) ? (sumEven - sumOdd) : (sumOdd - sumEven);
		System.out.println("The sum of odd numbers is " + sumOdd);
		System.out.println("The sum of even numbers is " + sumEven);
		System.out.println("Difference between the two sums: " + absDiff);
	}
}
