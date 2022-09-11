import javax.swing.*;

public class Swing01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame();//creating instance of JFrame  
		JButton button1=new JButton("click");//creating instance of JButton  
		button1.setBounds(50,50,60, 40);//x axis, y axis, width, height       
		frm.add(button1);//adding button in JFrame        
		frm.setSize(200,250);//200 width and 250 height  
		frm.setLayout(null);//using no layout managers  
		frm.setVisible(true);//making the frame visible  
	}
}
