package testing;

public class ConditionalStatements {

	public static void main(String[] args) {
		int a = 180;
		int b = 280;
		// which one is large value?
		if (a > b) {
			System.out.println("If block has executed, a is large value");
		} else if (b > a) {
			System.out.println("Else if block has executed, b is large value");
		} else {
			System.out.println("Else block has executed, both are equal");
		}

//NESTED-IF: Condition with-in the condition.
//		if (a > b) {
//			if (c > d) {
//
//			}
//		} 
		
	}

}
