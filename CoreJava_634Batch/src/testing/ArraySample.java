package testing;

public class ArraySample {

	public static void main(String[] args) {
		String a[] = { "Hi", "How", "are", "you", "Will you" };
		// Length: start from 1(one)
		// Index: start from 0(zero)
		System.out.println(a.length);

		// a[Index]: a[3]
		System.out.println(a[4]);
		System.out.println("******************");

		// Print all the array values
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("******************");

		// ForEach loop: To print array values, will use this for each loop
		for (String string : a) {
			System.out.println(string);
		}
		System.out.println("###########################");

		
		int b[] = {12,87,54,9856,2541,6895,988};
		System.out.println(b.length);
		for(int i =0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		for (int i : b) {
			System.out.println(i);

		}

	}

}
