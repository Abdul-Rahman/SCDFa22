/*
Example #6 – Spring Layout
Spring layout, as the name suggests, constrains the distance between the components.
 */
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
public class SpringLayoutDemo {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frme = new JFrame("Demo for Spring Layout");
		frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Define the panel to hold the components
		JPanel pnl = new JPanel();
		SpringLayout lyt = new SpringLayout();
		JLabel lbl = new JLabel("Name: ");
		JTextField txt = new JTextField("Enter text", 25);
		pnl.setSize(200, 200);
		pnl.setLayout(lyt);
		pnl.add(lbl);
		pnl.add(txt);
		// Put constraint on components
		lyt.putConstraint(SpringLayout.WEST, lbl, 6, SpringLayout.WEST, pnl);
		lyt.putConstraint(SpringLayout.NORTH, lbl, 6, SpringLayout.NORTH, pnl);
		lyt.putConstraint(SpringLayout.WEST, txt, 6, SpringLayout.EAST, lbl);
		lyt.putConstraint(SpringLayout.NORTH, txt, 6, SpringLayout.NORTH, pnl);
		frme.add(pnl);
		frme.pack();
		frme.setVisible(true);
	}
}
