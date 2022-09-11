//TableExample 
import javax.swing.*;    
public class ex07_Table01 {
	JFrame f;    
	public ex07_Table01() {
		f=new JFrame();    
		String column[]={"Roll No","Name","Sumera"}; 
		
	    String data[][]={ {"19K-1234","Fatima","Database"},    
	                          {"19K-2345","Ayesha","Automata"},    
	                          {"19K-3456","Khadeeja","Java"},
	                          {"","",""},
	                          {"","",""},
	                          {"","",""}};    
	            
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    f.add(sp);          
	    f.setSize(300,400);    
	    f.setVisible(true);    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex07_Table01();
	}

}
