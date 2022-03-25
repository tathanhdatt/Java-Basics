import java.util.Scanner;

public class SphereComputation {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		sc.close();

		double surfaceArea = 4 * Math.PI * radius * radius;
		double volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;

		System.out.printf("Surface area is %.2f\n", surfaceArea);
		System.out.printf("Volume is %.2f\n", volume);
	}
}
