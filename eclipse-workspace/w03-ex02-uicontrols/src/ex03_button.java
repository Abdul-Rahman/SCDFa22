import javax.swing.*;      
public class ex03_button{    
ex03_button(){    
	JFrame f=new JFrame("Button Example");            
	JButton b=new JButton(new ImageIcon("C:\\Users\\Administrator\\Desktop\\Dd\\FAST\\FAST\\2022_fall\\SCD\\eclipse-workspace\\w03-ex02-uicontrols\\src\\aqua_button.jpg"));    
	b.setBounds(100,100,100, 40);    
	f.add(b);    
	f.setSize(300,400);    
	f.setLayout(null);    
	f.setVisible(true);    
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new ex03_button();    
}    
}    