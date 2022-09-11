import javax.swing.*;

/*
Simple example of Swing by inheritance
We can also inherit the JFrame class, so there is no need to create 
the instance of JFrame class explicitly. (e.g., f=new JFrame() )
 */
public class Swing03 extends JFrame {
	JFrame f;  
	Swing03(){  
		JButton b=new JButton("click");//create button  
		b.setBounds(50,50,60, 40);         
		add(b);//adding button on frame  
		setSize(200,250);  
		setLayout(null);  
		setVisible(true);  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing03();
	}

}
