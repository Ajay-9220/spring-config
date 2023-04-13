package in.ajayit.rest;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import in.ajayit.binding.ExceptionInfo;

@RestController
public class DemoRestController {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(DemoRestController.class);


	@GetMapping("/")
	public String doAction() {
		String msg = "Read to progress..";
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			throw logger.error("Exception Occured ::" + e, e);
			throw new ArithmeticException(e.getMessage());
		}

		return msg;
	}
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleAE(ArithmeticException ae) {
	ExceptionInfo exception = new ExceptionInfo();
	exception.setMsg(ae.getMessage());
	exception.setCode("AIT0004");
	return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
