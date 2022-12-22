/*
2) byType autowiring mode
In case of byType autowiring mode, bean id and reference name may be different. 
But there must be only one bean of a type. 

It internally uses setter injection.

<bean id="b1" class="org.sssit.B"></bean>  
<bean id="a" class="org.sssit.A" autowire="byType"></bean>  


In this case, it works fine because you have created an instance of B type. It doesn't matter that you have different bean name than reference name.

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
a is created
hello a
hello b

-------------------
Further two modes are:

3) constructor autowiring mode
In case of constructor autowiring mode, spring container injects the dependency by 
highest parameterized constructor.
If you have 3 constructors in a class, zero-arg, one-arg and two-arg then injection 
will be performed by calling the two-arg constructor.

<bean id="b" class="org.sssit.B"></bean>  
<bean id="a" class="org.sssit.A" autowire="constructor"></bean>  


4) no autowiring mode
In case of no autowiring mode, spring container doesn't inject the dependency by autowiring.
<bean id="b" class="org.sssit.B"></bean>  
<bean id="a" class="org.sssit.A" autowire="no"></bean>  
*/