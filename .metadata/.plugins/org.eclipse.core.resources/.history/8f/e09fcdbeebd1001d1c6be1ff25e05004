package in.ajayit.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private String welcomeMsg;

	private String greetMsg;

@Value("${messages.welcome}")
	public String welcomeMsg() {

		return welcomeMsg;
		
		@Value("${messages.greet}")
		public String greetMsg() {
			
			return greetMsg;
		}

	}

}
