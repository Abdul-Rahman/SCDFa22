/* Constructor Injection with Collection Example */
package alphapeeler;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Question q=(Question)factory.getBean("q");  
	    q.displayInfo();  
	      
	}  
}  

/*
output:
111 What is AlphaPeeler?
answers are:
AlphaPeeler is a cryptography software
AlphaPeeler is listed in CEHv11 Module 20
AlphaPeeler is listed in Cryptography and Network Security by Dr. William Stallings
*/