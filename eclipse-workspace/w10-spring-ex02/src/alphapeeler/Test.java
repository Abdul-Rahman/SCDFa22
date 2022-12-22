/* Dependency Injection by Constructor Example */
package alphapeeler;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee s=(Employee)factory.getBean("e");  // bean id="e" in app context xml
        s.show();  
    }  
}  

/*

output:(if we inject id with int type in app context xml)
10 null

output:(if we inject id without any type in app context xml)
null 10

output:(if we inject both id and string values with int and string types in app context xml)
10 Abdul Rahman

output:(if we inject both id and string without types in app context xml)
10 Abdul Rahman

output: (if we don't inject any value at all in app context xml)
default constructor
0 null

*/