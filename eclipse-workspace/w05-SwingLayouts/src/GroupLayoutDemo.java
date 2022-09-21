/*
 * Example #5 – Group Layout
As the name suggests, group layouts different components and arranges them sequentially 
or in parallel. Here Button A, B, and C are in a sequential pattern, whereas Button 
C and D are grouped in parallel.
 */
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GroupLayoutDemo {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("AlphaPeeler App in Group Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jbtn1 = new JButton("Button A");
		JButton jbtn2 = new JButton("Button B");
		JButton jbtn3 = new JButton("Button C");
		JButton jbtn4 = new JButton("Button D");
		JPanel pnl = new JPanel();
		pnl.setSize(200, 200);
		GroupLayout lyt = new GroupLayout(pnl);
		lyt.setAutoCreateGaps(true);
		lyt.setAutoCreateContainerGaps(true);
		pnl.setLayout(lyt);
		// Set for horizontal and vertical group
		lyt.setHorizontalGroup(lyt.createSequentialGroup().addComponent(jbtn1).addComponent(jbtn2)
		.addGroup(lyt.createSequentialGroup().addGroup(lyt
		.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jbtn3).addComponent(jbtn4))));
		lyt.setVerticalGroup(
		lyt.createSequentialGroup().addComponent(jbtn1).addComponent(jbtn2).addComponent(jbtn3).addComponent(jbtn4));
		frame.add(pnl);
		frame.pack();
		frame.setVisible(true);
	}
}
