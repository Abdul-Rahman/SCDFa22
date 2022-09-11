import javax.swing.*;

/*
Example of Swing by Association inside constructor
We can also write all the codes of creating JFrame, JButton and method call 
inside the java constructor.
 */
public class Swing02 {
	JFrame f;
	Swing02(){
		f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(50,50,60, 40);  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(200,250);//200 width and 250 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing02();
	}

}
