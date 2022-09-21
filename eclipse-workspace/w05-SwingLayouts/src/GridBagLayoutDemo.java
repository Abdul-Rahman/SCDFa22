/*
 * Example #4 – Grid Bag Layout
In this example, we will see how we can align components in a customized grid-like 
fashion using the grid bag layout.
*/
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
public class GridBagLayoutDemo extends JFrame {
	public static void main(String[] args) {
		GridBagLayoutDemo gbld = new GridBagLayoutDemo();
	}
	public GridBagLayoutDemo() {
	setSize(300, 300);
	setPreferredSize(getSize());
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbcnt = new GridBagConstraints();
	setLayout(gbl);
	setTitle("AlphaPeeler App in GridBag Layout");
	GridBagLayout layout = new GridBagLayout(); //create grid bag layout
	this.setLayout(layout);
	//below code is customization of grid fashion
	gbcnt.fill = GridBagConstraints.HORIZONTAL;
	gbcnt.gridx = 1;
	gbcnt.gridy = 0;
	this.add(new Button("Linux"), gbcnt);
	gbcnt.gridx = 2;
	gbcnt.gridy = 0;
	this.add(new Button("Windows"), gbcnt);
	gbcnt.fill = GridBagConstraints.HORIZONTAL;
	gbcnt.ipady = 20;
	gbcnt.gridx = 1;
	gbcnt.gridy = 1;
	this.add(new Button("UNIX"), gbcnt);
	gbcnt.gridx = 2;
	gbcnt.gridy = 1;
	this.add(new Button("DOS"), gbcnt);
	gbcnt.gridx = 1;
	gbcnt.gridy = 2;
	gbcnt.fill = GridBagConstraints.HORIZONTAL;
	gbcnt.gridwidth = 2;
	this.add(new Button("Operation System"), gbcnt);
	}
}