//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		Random Bob = new Random();
		int number = Bob.nextInt(4);
		// 3. Print out this variable
		System.out.println(number);
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog(null, "I am a Magic 8 ball give me a question");
		// 5. If the random number is 0

		// -- tell the user "Yes"
		if (number == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// 6. If the random number is 1
		if (number == 1) {
			JOptionPane.showMessageDialog(null, "NO");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (number == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask google");
		}
		// -- tell the user "Maybe you should ask Google?"
		// 8. If the random number is 3
		if (number == 3) {
			JOptionPane.showMessageDialog(null, "NO");
		}
		// -- write your own answer

	}
}
