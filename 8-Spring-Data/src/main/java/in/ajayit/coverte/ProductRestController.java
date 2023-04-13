package in.ajayit.coverte;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ajayit.binding.Product;

@RestController
public class ProductRestController() {
	
	@GetMapping(value = "/product" = {"application/xml","application/json"})
	public ResponseEntity<String> getProduct(){
		
		Product product = new Product(111,"Spring",450.00);
		
		return new ReponseEntity<>(product,HttpStatus.OK);
		
		
		
		
	}
	
	
	
	

}
