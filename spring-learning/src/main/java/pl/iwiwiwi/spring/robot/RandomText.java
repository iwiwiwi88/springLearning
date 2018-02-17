package pl.iwiwiwi.spring.robot;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {

	private static String[] txt = { "kotek", "mruczek", "puszek" };

	public String getText() {
		Random r = new Random();
		return txt[r.nextInt(txt.length)];
		//return null;
	}
}
