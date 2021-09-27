/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] array;
	// 2 create an int variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String input = JOptionPane.showInputDialog("Enter a positve number kid");
		int answer = Integer.parseInt(input);
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		array = new JButton[answer];
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel
		Random ran = new Random();
		hiddenButton = ran.nextInt(answer);
		for (int i = 0; i < array.length; i++) {
			array[i] = new JButton();
			array[i].addActionListener(this);
			panel.add(array[i]);
		}
		array[hiddenButton].setText("Me");
		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "I don't even know the instructions on this game so your on ur own kid");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		
		// 14. Set the text of the JButton located at hiddenButton to "ME"
		
	
		// 15. Use Thread.sleep(1000); to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this
try {
	Thread.sleep(1000);
	array[hiddenButton].setText("");
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}
		// 16. Set the text of the JButton located at hiddenButton to be blank.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
if(array[hiddenButton]== buttonClicked ) {
	JOptionPane.showMessageDialog(null, "you won");
}
else {
	JOptionPane.showMessageDialog(null, "you lost");
}
		// 18. else tell them to try again
	}
}
