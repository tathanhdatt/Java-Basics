public class Tribonacci {

	public static void main(String[] args){
		int n = 4;
		int tn;
		int tnMinus1 = 1;
		int tnMinus2 = 1;
		int tnMinus3 = 2;
		int nMax = 20;

		System.out.println("The first " + nMax + " Tribonacci numbers are:");
		System.out.print(tnMinus1 + " " + tnMinus2 + " " + tnMinus3);

		while (n <= nMax) {
			tn = tnMinus1 + tnMinus2 + tnMinus3;
			System.out.print(" " + tn);

			++n;
			tnMinus3 = tnMinus2;
			tnMinus2 = tnMinus1;
			tnMinus1 = tn;
		}
	}
}
