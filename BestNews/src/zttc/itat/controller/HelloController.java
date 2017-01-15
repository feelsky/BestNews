package zttc.itat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	//呵呵
	@RequestMapping({"/hello","/"})
	public String hello(String username, Model model){
		System.out.println(username);
		model.addAttribute("username",username);
		return "user/hello.ftl";
	}
}
