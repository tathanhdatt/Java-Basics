public class ComputePI {

	public static void main(String[] args){
		final int MAX_TERM = 1000;

		double sum = 0;

		for (double term = 1; term < MAX_TERM; term++) {
			if (term % 2 == 1) {
				sum += 1/(term * 2 - 1);
			} else {
				sum -= 1/(term * 2 - 1);
			}
		}
		
		double pi = 4*sum;

		System.out.println("The value obtained: " + pi);
		System.out.println("Compare with Math.PI: " + (pi / Math.PI)*100);
	}
}
