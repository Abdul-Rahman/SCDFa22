/* Constructor Injection with Non-String Map (having dependent Object) Example */
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
Output:
question id:1
question name:What is Java?
Answers....
Answer Information:
Id:1 Answer:Java is a Programming Language Posted Date:Wed Dec 12 00:00:00 PKT 2001
Posted By:
Id:1 Name:Dr. Aqsa Email Id:dr_aqsa@gmail.com
Answer Information:
Id:2 Answer:Java is a Platform Posted Date:Fri Dec 12 00:00:00 PKT 2003
Posted By:
Id:2 Name:Dr. Waqas Email Id:dr_waqas@gmail.com
*/