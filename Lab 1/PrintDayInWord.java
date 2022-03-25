public class PrintDayInWord {
	public static void main(String[] args){
		int dayNumber = 0;

		switch (dayNumber) {
			case 0:
				System.out.print("Sunday");
				break;
			case 1:
				System.out.print("Monday");
				break;
			case 2:
				System.out.print("Tuesday");
				break;
			case 3:
				System.out.print("Wednesday");
				break;
			case 4:
				System.out.print("Thurday");
				break;
			case 5:
				System.out.print("Friday");
				break;
			case 6:
				System.out.print("Saturday");
				break;
			default:
				System.out.print("Not a valid day");
				break;
		}
	}
}
