package testing;

public class StringSample {

	public static void main(String[] args) {
		// String: Can store

		// int a = 90;
		String a = "Hi All, How are you?";
		System.out.println(a);
		
		// Length: start from 1(one)
		// Index: start from 0(zero)
		
		String b = "SelENium";
		System.out.println(b);
		// Length():
		System.out.println(b.length());
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());

		String c = "Automation";
		System.out.println(c);

		System.out.println(b + c);

		String d = "ApplE";
		String e = "apples";
		// the above two Strings are matching/Equal?
		if (d.equals(e)) {
			System.out.println("Both the strings are matching***");
		} else {
			System.out.println("Both the strings are not matching***");
		}

		// Equal() vs EqulaIgnoreCase()
		// while comparing two strings Equal, will check length and each and every
		// character should match
		// EqulaIgnoreCase()

		// while comparing two strings EqulaIgnoreCase, will check length and each
		// If any uppercase letters were there, it will automaticall covert into lower
		// cases

		if (d.equalsIgnoreCase(e)) {
			System.out.println("Both the strings are matching#####");
		} else {
			System.out.println("Both the strings are not matching####");
		}

	}

}
