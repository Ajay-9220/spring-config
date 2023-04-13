package in.ajayit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "thanks you  ..");
		
		mav.setViewName("greet");
		return mav;
	}


	
}
