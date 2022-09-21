/*
 * Example #1 – Border Layout
In this example, we will see how we can divide a frame in different borders or 
sectional layout. Here we will divide the frame into 5 different sections.
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
public class BorderLayoutDemo {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame fj = new JFrame("AlphaPeeler App in Border Layout");
		fj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jbtn1 = new JButton("Top Header");
		JButton jbtn2 = new JButton("Footer");
		JButton jbtn3 = new JButton("LEFT");
		JButton jbtn4 = new JButton("RIGHT");
		JButton jbtn5 = new JButton("MIDDLE");
		JPanel pnl = new JPanel();
		pnl.setLayout(new BorderLayout());
		pnl.add(jbtn1, BorderLayout.NORTH);
		pnl.add(jbtn2, BorderLayout.SOUTH);
		pnl.add(jbtn3, BorderLayout.WEST);
		pnl.add(jbtn4, BorderLayout.EAST);
		pnl.add(jbtn5, BorderLayout.CENTER);
		fj.add(pnl);
		fj.pack();
		fj.setVisible(true);
	}
}
