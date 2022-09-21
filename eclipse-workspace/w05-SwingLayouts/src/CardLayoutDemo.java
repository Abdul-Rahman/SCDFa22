/*
Example #7 – Card Layout
The card layout is not used as much nowadays. This layout basically stacks one component 
on other as a card. You can ignore the exception of code as anyway it will show you 
the output.
 */
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class CardLayoutDemo extends JFrame implements ActionListener {
	public static CardLayout crd = new CardLayout(70, 60);
	public static Container cn;
	@Override
	public void actionPerformed(ActionEvent e) {
	crd.next(cn);
	}
	public static void main(String[] args) {
	CardLayoutDemo cld = new CardLayoutDemo();
	}
	public CardLayoutDemo() {
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	CardLayout cl = new CardLayout();
	setLayout(cl);
	setTitle("AlphaPeeler App in Card Layout");
	setSize(200, 200);
	add(new Button("Layout Button 1"));
	add(new Button("Layout Button 2"));
	add(new Button("Layout Button 3"));
	add(new Button("Layout Button 4"));
	add(new Button("Layout Button 5"));
	add(new Button("Layout Button 6"));
	}
}