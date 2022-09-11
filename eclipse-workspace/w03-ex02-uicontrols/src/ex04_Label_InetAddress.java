/* Examples for JLabel, InetAddress, JTextField , JButton
 * JFrame, InetAddress.getByName(host).getHostAddress()
 * AWT : ActionListener
*/

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class ex04_Label_InetAddress extends JFrame implements ActionListener {
	JTextField tf; JLabel l; JButton b;  
	ex04_Label_InetAddress(){  
        tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  
        l=new JLabel();
        l.setBounds(50,100, 250,20);      
        b=new JButton("Find IP");  
        b.setBounds(50,150,95,30);  
        b.addActionListener(this);    
        add(b);add(tf);add(l);    
        setSize(350,250);  
        setLayout(null);  
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // due to extends JFrame 
    }  
    public void actionPerformed(ActionEvent e) {  
        try{  
        String host=tf.getText();  
        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
        l.setText("IP of "+host+" is: "+ip);  
        }catch(Exception ex){System.out.println(ex);}  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex04_Label_InetAddress();
	}

}
