import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String bob = JOptionPane.showInputDialog(null, "How old are you?");
	int dod = Integer.parseInt(bob);

	if (dod <18) {
		JOptionPane.showMessageDialog(null, "nobody cares what you think.");
	}
	if (dod >= 18) {
		JOptionPane.showMessageDialog(null, "Who do you think the next presednet should be?");
	}
}
}
