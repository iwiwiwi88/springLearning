package pl.iwiwiwi.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"pl/iwiwiwi/spring/beans/beans.xml");
		//Person p = (Person) context.getBean("person1");
		//p.setTaxId(76543);
		
		//System.out.println(p);
		
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
