package testing;

public class MethodSample {
	public static void add() {
		int a = 70;
		int b = 80;
		System.out.println(a + b);
	}// add method ends
	
	public static void sub() {
		int a = 70;
		int b = 80;
		System.out.println(a - b);
	}
	

	public static void main(String[] args) {
		System.out.println("only Main method");
		//calling method
		add();
		sub();
	}
}
