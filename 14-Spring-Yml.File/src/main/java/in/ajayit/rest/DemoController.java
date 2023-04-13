package in.ajayit.rest;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ajayit.pro.AppProperties;

@RestController
public class DemoController {
	
	private AppProperties  pro;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
	Map<String, String> messages = pro.getMessages();
	String value = messages.get("welcomeMsg");
	return value;
		
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> messages = pro.getMessages();
		String value = messages.get("welcomeMsg");
		
		return value;
		
	}
	
	public String getWishMsg() {
		Map<String, String> messages = pro.getMessages();
		String value = messages.get("welcomeMsg");
	return	value;
	}
	
	
	
	


}
