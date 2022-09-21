/*
 * Example #3 – Grid Layout
Let us take an example of the implementation of grid layout in the case of java 
Swing. In this example, we will see how we can align components in grid-like 
fashion using a grid layout.
 */
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;
public class GridLayoutDemo extends JFrame {
	public static void main(String[] args) {
		GridLayoutDemo gld = new GridLayoutDemo();
	}

	public GridLayoutDemo() {
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE); //indicates terminate operation on close of window
	GridLayout gl = new GridLayout(3, 2);//create grid layout frame
	setLayout(gl);
	setTitle("AlphaPeeler App in Grid Layout");
	setSize(200, 200);
	add(new Button("Button A"));
	add(new Button("Button B"));
	add(new Button("Button C"));
	add(new Button("Button D"));
	add(new Button("Button E"));
	add(new Button("Button F"));
	}
}