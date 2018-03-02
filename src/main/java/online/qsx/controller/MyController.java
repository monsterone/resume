package online.qsx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("my")
public class MyController {
	
	//http://localhost:8080/resume/my/to_index
	@RequestMapping(value = "to_index", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView to_index(ModelAndView mav){
		mav.setViewName("index");
		System.out.println("to..go");
		return mav;
	}

}
