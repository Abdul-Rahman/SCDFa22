/*
Setter Injection with Dependent Object Example
Like Constructor Injection, we can inject the dependency of another bean using setters. 
In such case, we use property element. Here, our scenario is Employee HAS-A Address. 
The Address class object will be termed as the dependent object. 
 */
package alphapeeler;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
//	Resource r=new ClassPathResource("applicationContext.xml");
//	BeanFactory factory=new XmlBeanFactory(r);
	ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e=(Employee)factory.getBean("obj");
	e.displayInfo();
	
}
}

/*
Output:
1 Hashim Kaliya
21/3, Liaquat Avenue Model Colony Sindh Pakistan
*/