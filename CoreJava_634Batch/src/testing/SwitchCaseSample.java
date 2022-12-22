package testing;

public class SwitchCaseSample {

	public static void main(String[] args) {
//		0	Sunday
//		1	Monday
//		2	Tuesday
//		3	Wednesday
//		4	Thursday
//		5	Friday
//		6	Saturday
//		7	Sunday

		int weekdayNumber = 8;
		
		switch (weekdayNumber) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter weekname in between 1-7");
			break;
		}

	}

}
