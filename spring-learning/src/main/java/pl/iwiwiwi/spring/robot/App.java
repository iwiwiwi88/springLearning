package pl.iwiwiwi.spring.robot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("pl/iwiwiwi/spring/beans/propsbeans.xml");

		OffersDAO o = (OffersDAO) context.getBean("offersDao");
		try {
			// o.create(new Offer("Kamil","kamil@o2.pl", "Guacamole"));
			List<Offer> ofs = new ArrayList<Offer>();
			ofs.add(new Offer(10, "Tomek", "tomek@o2.pl", "Zapieksy"));
			ofs.add(new Offer(13, "Karolina", "karolina@o2.pl", "Ninka"));
			//Offer offer = new Offer(6, "Mariola", "mariola@o2.pl", "Kukuś");
			//o.update(offer);
			o.create(ofs);
			List<Offer> list = o.getOffers();
			for (Offer of : list) {
				System.out.println(of);
			}
			//System.out.println(o.getOffer(2));
			// o.delete(4);
		} catch (DataAccessException e) {
			System.out.println(e.getMessage() + "\n" + e.getClass());
		}
		// Robot robot = (Robot) context.getBean("robot");
		// robot.speak();
		((ClassPathXmlApplicationContext) context).close();
	}
}
