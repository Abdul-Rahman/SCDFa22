import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class ex06 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Swing Controls Example");    
		final JPasswordField pass = new JPasswordField(); 
		pass.setBounds(5,5,100,30);   
		f.add(pass);
	    //--------------------//
	    JCheckBox checkBox1 = new JCheckBox("Sara");  
        checkBox1.setBounds(5,35, 100,30);  
        JCheckBox checkBox2 = new JCheckBox("Saima", true);  
        checkBox2.setBounds(5,65, 100,30);  
        f.add(checkBox1); f.add(checkBox2);
        //--------------------//
        JRadioButton r1=new JRadioButton("(A) Kashaf");    
        JRadioButton r2=new JRadioButton("(B) Kainat");    
        r1.setBounds(5,95,100,30);    
        r2.setBounds(5,125,100,30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);    
        f.add(r1);f.add(r2);      
        //--------------------//
        String country[]={"Pakistan","K.S.A.","U.S.A.","England","Newzealand"};        
        JComboBox cb=new JComboBox(country);    
        cb.setBounds(5,155,90,20);    
        f.add(cb); 
        //--------------------//

        DefaultListModel<String> l1 = new DefaultListModel<>();  
        l1.addElement("Item1");  
        l1.addElement("Item2");  
        l1.addElement("Item3");  
        l1.addElement("Item4");  
        JList<String> list = new JList<>(l1);  
        list.setBounds(110,5, 75,75);  
        f.add(list);  
        
      //--------------------//
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25); 
        slider.setBounds(5, 190, 60, 20);
        f.add(slider);
        
      //--------------------//
        //Java JTabbedPane Example
        JTextArea ta=new JTextArea(200,200);  
        JPanel p1=new JPanel();  
        p1.add(ta);  
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel();  
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(5,220,200,200);  
        tp.add("main",p1);  
        tp.add("visit",p2);  
        tp.add("help",p3);    
        f.add(tp);  
      //--------------------//
        
        SpinnerModel value = new SpinnerNumberModel(5, //initial value  
                   0, //minimum value  
                   10, //maximum value  
                   1); //step  
       JSpinner spinner = new JSpinner(value);   
       spinner.setBounds(200,5,50,30);    
       f.add(spinner);    
       //--------------------//
       JProgressBar jb=new JProgressBar(0,100);    
       jb.setBounds(200,35,160,30);         
       jb.setValue(45);    
       jb.setStringPainted(true);   
       f.add(jb); 
       //--------------------//
       
      
      
               
               
	    f.setSize(350,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}
		
}
