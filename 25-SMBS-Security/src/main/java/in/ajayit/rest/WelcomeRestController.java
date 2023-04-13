package in.ajayit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/")
	public String getWelcomeMsg() {
		
		String msg ="Welcome to ashokit..";
		return msg;
	}

}
