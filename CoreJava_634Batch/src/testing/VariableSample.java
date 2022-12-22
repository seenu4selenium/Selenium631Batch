package testing;

public class VariableSample {
	// Global variable
	public static int a = 120;
	public static int b = 30;

	public static void add() {
		// Local variable
		//int a = 100;
		int b = 80;
		System.out.println(a + b);
	}

	public static void sub() {
		// Local variable
		//int a = 90;
		//int b = 50;
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		add();
		sub();
	}

}
