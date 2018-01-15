package cn.smbms.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	private Logger logger = Logger.getLogger(WelcomeController.class);
	@RequestMapping("/welcome")
	public String welcome() {
		logger.info("Ñ§¿ò¼Ü¾ÍÑ§Spring MVC!");
		return "index";
	}
}
