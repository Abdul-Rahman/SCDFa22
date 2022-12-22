/*
2) byType autowiring mode (multiple bean of one type)
In case of byType autowiring mode, bean id and reference name may be different. 
But there must be only one bean of a type. 

But, if you have multiple bean of one type, it will not work and throw exception.


Let's see the code where are many bean of type B.

<bean id="b1" class="org.sssit.B"></bean>  
<bean id="b2" class="org.sssit.B"></bean>  
<bean id="a" class="org.sssit.A" autowire="byType"></bean>  
In such case, it will throw exception.


 */
package alphapeeler;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
    A a=context.getBean("a",A.class);  
    a.display();  
}  
}  


/*
Output:
b is created
b is created
a is created
Exception in thread "main" 
*/