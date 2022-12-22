/*
Setter Injection with Non-String Collection (having Dependent Object) Example
 */
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
1 What is Java?
answers are:
1 Java is a programming language Ravi Malik
2 Java is a platform Sachin
*/