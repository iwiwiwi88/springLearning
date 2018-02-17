package pl.iwiwiwi.spring.logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component
public class Logger {

	// @Autowired
	private ConsoleWriter consoleWriter;
	// @Autowired
	private LogWriter fileWriter;

	/*
	 * public Logger() {
	 * 
	 * }
	 * 
	 * @Autowired public Logger(ConsoleWriter c, FileWriter f) {
	 * this.consoleWriter = c; this.fileWriter = f; }
	 */

	@Inject
	//@Named(value="panda")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Inject
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String txt) {
		fileWriter.write(txt);
	}

	public void writeConsole(String txt) {
		consoleWriter.write(txt);

	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

}
