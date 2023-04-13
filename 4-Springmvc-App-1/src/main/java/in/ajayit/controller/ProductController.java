package in.ajayit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ajayit.binding.Product;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String getProductDetails(Model model) {
		
		Product productObj = new Product();
		
		model.addAttribute("msg",productObj);
		
		return "index";
		
	}
	
	@PostMapping("/product")
	public String handleFormSubmit(Product product,Model model) {
		
		System.out.println(product);
		model.addAttribute("msg","Save Product successful");
		return"success";
		
	}
	

}
