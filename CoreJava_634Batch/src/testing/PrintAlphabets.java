package testing;

public class PrintAlphabets {

	public static void main(String[] args) {

		// 1-10 number
		for (int i = 1; i < 11; i++) {
			System.out.print(i );// 12345678910
		} // end of the for loop
		
		System.out.println("");

		for (char abc = 'a'; abc <= 'z'; abc++) {// 65<=90
			System.out.print(abc);
		}
		
		System.out.println("");

		for (char abc = 'A'; abc <= 'Z'; abc++) {// 65<=90
			System.out.print(abc);
		}

	}

}
