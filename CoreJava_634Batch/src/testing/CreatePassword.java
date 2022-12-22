package testing;

import java.util.Random;

public class CreatePassword {
// 'Password must have a minimum of 8 characters,
//	at least one digit (0-9),
//	one lowercase character (a-z) 
//	and one uppercase character (A-Z),
//	one special character (!@#$%^&*)

	//https://www.tutorialspoint.com/Generating-password-in-Java
	
	public static void main(String[] args) {
		String numbers = "0123456789";// 10
		String abcLowercase = "abcdefghijklmnopqrstuvwxyz";// 26
		String abcUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// 26
		String specialChars = "(!@#$%^&*)";// 10
		// System.out.println(specialChars.length());

		Random r = new Random();

		int n1 = r.nextInt(numbers.length());
		int n2 = r.nextInt(numbers.length());
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("******************");

		int a1 = r.nextInt(abcLowercase.length());
		int a2 = r.nextInt(abcLowercase.length());
		// Print a1 char from the String
		System.out.println(abcLowercase.charAt(a1));
		System.out.println(abcLowercase.charAt(a2));
		System.out.println("******************");

		int A1 = r.nextInt(abcUppercase.length());
		int A2 = r.nextInt(abcUppercase.length());
		// Print a1 char from the String
		System.out.println(abcUppercase.charAt(A1));
		System.out.println(abcUppercase.charAt(A2));
		System.out.println("******************");

		int s1 = r.nextInt(specialChars.length());
		int s2 = r.nextInt(specialChars.length());
		System.out.println(specialChars.charAt(s1));
		System.out.println(specialChars.charAt(s2));
		System.out.println("******************");

		System.out.println("******************");
		System.out.println(n1 + "" + n2 + "" + abcLowercase.charAt(a1) + "" + abcLowercase.charAt(a2) + ""
				+ abcUppercase.charAt(A1) + "" + abcUppercase.charAt(A2) + "" + specialChars.charAt(s1) + ""
				+ specialChars.charAt(s2));

	}
}
