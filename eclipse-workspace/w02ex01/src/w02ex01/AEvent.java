// Java program to demonstrate the
// event handling within the class
package w02ex01;
import java.awt.*;  
import java.awt.event.*;  
class AEvent extends Frame implements ActionListener{  
	TextField textField;  
	AEvent(){  
		//create components  
		textField =new TextField();  
		textField.setBounds(60,50,170,20);  
		Button button=new Button("click me");  
		button.setBounds(100,120,80,30);  
		  
		// Registering component with listener
        // this refers to current instance
	
		button.addActionListener(this);  
		  
		//add components and set size, layout and visibility  
		add(button);
		add(textField);  
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);  
	}  
	
	public void actionPerformed(ActionEvent e){  
		textField.setText("event handling within class");  
	}  
	public static void main(String args[]){  
		new AEvent();  
	}  
}  