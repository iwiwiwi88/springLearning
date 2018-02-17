package pl.iwiwiwi.spring.logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"pl/iwiwiwi/spring/beans/loggerbeans.xml");
		
		Logger l = (Logger) context.getBean("logger");
		
		l.writeConsole("ConsoleWriter was here");
		l.writeFile("FileWriter was here");
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
