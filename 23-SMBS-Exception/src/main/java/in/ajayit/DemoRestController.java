package in.ajayit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ajayit.binding.ExceptionInfo;

@RestControllerAdvice
public class DemoRestController {
	
	@ExceptionHandler(value=ArithmeticeException.class)
	public ResponseEntity<ExceptionInfo> handleAE(ArithmeticException e){
		ExceptionInfo exception = new ExceptionInfo();
		exception.setMsg("not found");
		exception.setMsg("AND008");
		
		return new ResponseEntity<>(exception,HttpStatus.OK);
		
		
	}
	
	
	
	

}
