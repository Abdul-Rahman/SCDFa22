/*
 * Example #2 – Flow Layout
Here we will create a window inside which the components inside the frame are 
arranged in a direction: from left to right until the end till the frame ends. 
After that components will be automatically taking new rows and be aligned 
accordingly.
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
public class FlowLayoutDemo {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame fj = new JFrame("AlphaPeeler App in Flow Layout");
		fj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Define new buttons
		JButton jbtn1 = new JButton("Button A");
		JButton jbtn2 = new JButton("Button B");
		JButton jbtn3 = new JButton("Button C");
		JPanel pnl = new JPanel();
		pnl.setLayout(new FlowLayout());
		pnl.add(jbtn1);
		pnl.add(jbtn2);
		pnl.add(jbtn3);
		pnl.add(new JButton("Button D"));
		pnl.add(new JButton("Button E"));
		pnl.add(new JButton("Button F"));
		pnl.add(new JButton("Button G"));
		pnl.add(new JButton("Button H"));
		pnl.add(new JButton("Button I"));
		pnl.add(new JButton("Button J"));
		pnl.add(new JButton("Button K"));
		pnl.add(new JButton("Button L"));
		pnl.add(new JButton("Button M"));
		pnl.add(new JButton("Button N"));
		pnl.add(new JButton("Button O"));
		pnl.add(new JButton("Button P"));
		pnl.add(new JButton("Button Q"));
		pnl.add(new JButton("Button R"));
		pnl.add(new JButton("Button S"));
		pnl.add(new JButton("Button T"));
		pnl.add(new JButton("Button U"));
		fj.add(pnl);
		fj.pack();
		fj.setVisible(true);
	}
}