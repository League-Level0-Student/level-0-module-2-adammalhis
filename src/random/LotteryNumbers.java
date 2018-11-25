package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(10000);
		int randomNumber2 = randomMaker.nextInt(10000);
		int randomNumber3 = randomMaker.nextInt(10000);
		int randomNumber4 = randomMaker.nextInt(10000);
		int randomNumber5 = randomMaker.nextInt(10000);

		JOptionPane.showMessageDialog(null, "Lottery Ticet:" + randomNumber + "," + randomNumber2 + "," + randomNumber3
				+ "," + randomNumber4 + "," + randomNumber5);

	}
}
