package in.ajayit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ajayit.binding.Product;

@RestController
public class ProductRestController() {

	
	@GetMapping(value ="/product",produces = {"application/xml","appliction/json"} )

	public ResponseEntity<Product> getProduct(){
		
		Product p1 = new Product(111,"java",4500.00);
		Product p0 = new Product(101, "Monitor", 8000.00);
		Product p2 = new Product(102, "RAM", 6000.00);
		Product p3 = new Product(103, "CPU", 15000.00);

	List<Product>products = Arrays.asList(p1,p2,p3,p0);
		
		return new ResponseEntity<>(p1,HttpStatus.OK);
		
		
	}

	

}
