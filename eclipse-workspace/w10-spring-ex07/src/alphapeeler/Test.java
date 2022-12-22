/* Constructor Injection with Map Example 
 * In this example, we are using map as the answer that have answer with posted username. 
 * Here, we are using key and value pair both as a string. Like previous examples, it is 
 * the example of forum where one question can have multiple answers.
 * */

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
Output
question id:11
question name:What is AlphaPeeler?
Answers....
Answer:AlphaPeeler is a cryptography software Posted By:Dr. Kamran
Answer:AlphaPeeler is listed in CEHv11 Module 20 Posted By:Dr. Ayesha
Answer:AlphaPeeler is listed in Cryptography and Network Security by Dr. William Stallings Posted By:Dr. Ayesha
Answer:AlphaPeeler is listed in Crypto++ API page Posted By:Engr. Shahbaz Ahmed Siddiqui


Note: entry #2 is duplicate in app context xml but due to maps/sets entry it shows only one entry of Dr. Ayesha in output.
<map>  
<entry key="AlphaPeeler is a cryptography software"  value="Dr. Kamran"></entry>  
<entry key="AlphaPeeler is listed in CEHv11 Module 20" value="Dr. Ayesha"></entry>  
<entry key="AlphaPeeler is listed in CEHv11 Module 20" value="Dr. Ayesha"></entry>  
<entry key="AlphaPeeler is listed in Cryptography and Network Security by Dr. William Stallings" value="Dr. Ayesha"></entry>  
<entry key="AlphaPeeler is listed in Crypto++ API page" value="Engr. Shahbaz Ahmed Siddiqui"></entry>  
</map> 
*/