package zttc.itat.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	private static final Logger logger = Logger.getLogger(HelloController.class);  

	@RequestMapping({"/hello","/"})
	public String hello(String username, Model model){
		System.out.println(username);
		logger.info("This is debug message.");
		logger.info("This is debug message1.");
		model.addAttribute("username",username);
		return "user/hello.ftl";
	}
}
