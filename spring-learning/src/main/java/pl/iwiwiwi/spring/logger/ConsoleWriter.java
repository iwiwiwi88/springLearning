package pl.iwiwiwi.spring.logger;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {
	public void write(String txt) {
		System.out.println("Console: " + txt);
	}
}
