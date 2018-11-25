package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String bob = JOptionPane.showInputDialog(null, "How tall are you in inches?");
		int dod = Integer.parseInt(bob);

		if (dod < 48) {
			JOptionPane.showMessageDialog(null, "You are too short to ride on the roller coaster.");
		}
		if (dod > 48) {
			JOptionPane.showMessageDialog(null, "You can ride on the roller coaster!");
		}
	}
}
