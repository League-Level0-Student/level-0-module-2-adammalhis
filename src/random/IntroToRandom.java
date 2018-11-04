//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] nargs) {

		int r = 0;

		// 3. Now make r random.
		// Create an object of the Random class
		// use .nextInt() to get a random number
		Random Bob = new Random();
		;
		// 4. Limit the random number between 0 and 100
		int randomChoice = Bob.nextInt(101);
		// 5. Limit the random number between 25 and 75. Hint: ((highest value - lowest
		// value)+1) + lowest value
		int randomChoice2 = Bob.nextInt(((88 - -222) + 1) + -222);

		System.out.println(randomChoice2);

		// 6. Challenge: Limit the random number between -222 and 88
		int randomChoice3 = Bob.nextInt(((88 - -222) + 1) + -222);
		System.out.println(randomChoice3);

		int randomChoice22 = Bob.nextInt(((88 - -222) + 1) + -222);

		// 1. Print out the value of r

		// 2. Run the program. What number appears in the console?
		// Run it again. Is the number the same?
	}
}