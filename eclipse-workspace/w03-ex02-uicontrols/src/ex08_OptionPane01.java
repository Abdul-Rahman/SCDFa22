//Java JOptionPane Examples: showMessageDialog()
//Java JOptionPane Example: showInputDialog()

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

import javax.swing.*;
import javax.swing.JOptionPane;

public class ex08_OptionPane01 {
	JFrame f;
	public ex08_OptionPane01() {	
		f=new JFrame();  
		JOptionPane.showMessageDialog(f,"Hello, Welcome to AlphaPeeler.");
		JOptionPane.showMessageDialog(f,"Updated.","Alert",JOptionPane.WARNING_MESSAGE);     
		String name=JOptionPane.showInputDialog(f,"Enter Name");
		System.out.println(name);
		int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
		if(a==JOptionPane.YES_OPTION){  
			System.out.println("YES pressed in confirmation dialog");
		}
		if(a==JOptionPane.NO_OPTION){  
			System.out.println("NO pressed in confirmation dialog");
		}
		if(a==JOptionPane.CANCEL_OPTION){  
			System.out.println("CANCEL pressed in confirmation dialog");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex08_OptionPane01();
	}

}
