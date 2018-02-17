package pl.iwiwiwi.spring.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"pl/iwiwiwi/spring/beans/junglebeans.xml");
		Jungle j = (Jungle)context.getBean("jungle");
		
		System.out.println(j);
		((ClassPathXmlApplicationContext)context).close();
	}

}
