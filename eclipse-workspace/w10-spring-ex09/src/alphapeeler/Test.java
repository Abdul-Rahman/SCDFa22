/* 
 * Inheriting Bean in Spring
 * By using the parent attribute of bean, we can specify the inheritance relation between the beans. 
 * In such case, parent bean values will be inherited to the current bean.
 * 
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
	      
	    Employee e1=(Employee)factory.getBean("e2");  
	    e1.show();  
	      
	}  
}  

/*
output:
101 Imran
House No 21/3,Liaquat Avenue Model Town Sindh Pakistan

*/
