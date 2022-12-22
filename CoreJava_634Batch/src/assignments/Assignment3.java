package assignments;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -765;
		if (age > 0 && age <= 2) {
			System.out.println("Infant");
		} else if (age > 2 && age <= 12) {
			System.out.println("Child");
		} else if ((age > 12) && (age <= 25)) {
			System.out.println("Youth");
		} else if (age > 25 && age <= 59) {
			System.out.println("Adult");
		} else if (age > 59 && (age <= 100)) {
			System.out.println("Senior Citizen");
		} else {
			System.out.println("Please enter user age in between 1 to 100 ");
		}

	}

}
