package in.ajayit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ajayit.binding.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String getForm(Model model) {

		User userObj = new User();

		model.addAttribute("user", "userObj");
		return "index";
	}
@PostMapping("/register")
	public String handleForm( @Valid User userForm,BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index";
		}
		
		System.out.println(userForm);
		model.addAttribute("msg","registratoin succussful");
		return "success";
		
	}

}
