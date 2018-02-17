package pl.iwiwiwi.spring.fruitbasket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"pl/iwiwiwi/spring/beans/fruitsbeans.xml");
		FruitBasket fb = (FruitBasket)context.getBean("basket");
		
		System.out.println(fb);
		((ClassPathXmlApplicationContext)context).close();
	}

}
