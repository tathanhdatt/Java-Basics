import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		sc.close();

		double diameter = radius * 2;
		double circumference = diameter * Math.PI;
		double area = radius * radius * Math.PI;

		System.out.printf("Diameter is %.2f\n", diameter);
		System.out.printf("Circumference is %.2f\n", circumference);
		System.out.printf("Area is %.2f\n", area);
	}
}
