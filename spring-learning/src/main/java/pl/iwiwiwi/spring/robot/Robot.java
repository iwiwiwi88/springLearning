package pl.iwiwiwi.spring.robot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Robot {

	private String id = "robocik";
	private String speech = "Hi";

	public void speak() {
		System.out.println(id+": "+speech);
	}

	//@Value("#{randomText.getText()?.length()}") 
	// jdbc.user
	//@Autowired
	public void setId(String id) {
		this.id = id;
	}

	//SPEL
	//new java.util.Date().toString()
	//T(Math).PI
	//4 le 5
	//jdbc.password
	//@Autowired
	public void setSpeech(@Value("#{4 le 5 ? 'yes' : 'no'}") String speech) {
		this.speech = speech;
	}

}
