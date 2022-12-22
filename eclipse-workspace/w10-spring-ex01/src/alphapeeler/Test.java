/*
Creating spring application in Eclipse IDE
 */
package alphapeeler;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  


// for Methid 2 : Using ApplicationContext
//for following 2 also import external JAR  : org.springframework.context-3.0.1.RELEASE-A.jar
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1 : Using BeanFactory
		
		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("studentbean");  //Bean id="studentbean" in app context xml
	    student.displayInfo();  
	    
		
		// for Methid 2 : Using ApplicationContext
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Student student2=(Student)context.getBean("studentbean");
		//student2.displayInfo();
	    
	    
	}

}
