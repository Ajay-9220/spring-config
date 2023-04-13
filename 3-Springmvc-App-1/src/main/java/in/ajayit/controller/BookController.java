package in.ajayit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ajayit.binding.Book;
@Controller
public class BookController {
	@GetMapping("/book")
	public String getBookDetails(Model model) {
		
		Book bookObj = new Book(111,"Spring",4500);
		
		model.addAttribute("book",bookObj);
		
		return "books";
		
		
		
		
	}

}
