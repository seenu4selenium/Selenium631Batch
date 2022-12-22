package testing;

import java.util.Random;

public class RandomeNumberGenreration {

	public static void main(String[] args) {
		//print random number in between 0 - 100
		//Create object for existing java class
		//CLASSNAME objectNAme = new CLASSNAME();
		Random r = new Random();
		
		System.out.println(r.nextInt(100));

	}

}
