package pl.iwiwiwi.spring.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {
	@RequestMapping("/")
	public String showHome() {
		//HttpSession session
		//session.setAttribute("name", "Iwi");
		// Session: <%= session.getAttribute("name") %> <p/>
		return "home";
	}
}
