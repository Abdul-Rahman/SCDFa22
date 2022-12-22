/*
 * Constructor Injection with Non-String Collection (having Dependent Object) Example
 * If we have dependent object in the collection, we can inject these information by using the ref element inside 
 * the list, set or map. In this example, we are taking the example of Forum where One question can have multiple 
 * answers. But Answer has its own information such as answerId, answer and postedBy. There are four pages used 
 * in this example:
 * 1. Question.java
 * 2. Answer.java
 * 3. applicationContext.xml
 * 4. Test.java
 * In this example, we are using list that can have duplicate elements, you may use set that have only unique elements.
 * But, you need to change list to set in the applicationContext.xml file and List to Set in the Question.java file.
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
111 What is java?
answers are:
1 Java is a programming language Dr. Ayesha
2 Java is a Platform Dr. Kamran

*/