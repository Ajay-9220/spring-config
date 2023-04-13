package in.ajayit.binding;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg( ) {

		String msg = "welcome to ajay..";

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg ="welcome greet...";
		
		return msg;
		
	}
}
