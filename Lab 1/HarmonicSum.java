public class HarmonicSum {

	public static void main(String[] args){

		final int MAX_DENOMINATOR = 50000;

		double sumL2R = 0;
		double sumR2L = 0;

		for (int denominator = 1; denominator < MAX_DENOMINATOR; denominator++) {
			sumL2R += 1/(double)denominator;
		}

		for (int denominator = MAX_DENOMINATOR; denominator > 0; denominator--) {
			sumR2L += 1/(double)denominator;
		}

		System.out.println("The sum from left-to-right is: " + sumL2R);
		System.out.println("The sum from right-to-left is: " + sumR2L);

		if (sumL2R > sumR2L) {
			System.out.println("The absolute difference is: " + (sumL2R - sumR2L));
		} else {
			System.out.println("The absolute difference is: " + (sumR2L - sumL2R));
		}
	}
}
