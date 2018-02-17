package pl.iwiwiwi.spring.logger;

import org.springframework.stereotype.Component;

@Component
public class FileWriter implements LogWriter {
	public void write(String txt) {
		System.out.println("Writing to file: " + txt);
	}
}
