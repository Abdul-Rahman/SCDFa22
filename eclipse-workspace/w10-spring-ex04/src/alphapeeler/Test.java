/*
 * Constructor Injection with Dependent Object
 * If there is HAS-A relationship between the classes, we create the instance of dependent object (contained object) 
 * first then pass it as an argument of the main class constructor. Here, our scenario is Employee HAS-A Address. 
 * The Address class object will be termed as the dependent object. Let's see the Address class first: */

package alphapeeler;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee s=(Employee)factory.getBean("e");  
        s.show();  
          
    }  
}  

/*
output:
12 Engr. Abdul Rahman
Karachi Sindh Pakistan
*/