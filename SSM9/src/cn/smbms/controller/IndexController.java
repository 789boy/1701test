package cn.smbms.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;



/*public class IndexController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hellow,springMVC!");
		return new ModelAndView("index");
	}*/
	/*@Controller
    public class IndexController {
		private Logger logger = Logger.getLogger(IndexController.class);
		@RequestMapping("/index")
		public String index() {
			logger.info("hellow,SpringMVC!");
			return "index";
		}
	}
	@Controller
    public class IndexController {
		private Logger logger = Logger.getLogger(IndexController.class);
		@RequestMapping("/welcome")
		public String welcome(@RequestParam String username) {
			logger.info("welcome" + username);
			return "index";
		}
	}
	@Controller
	@RequestMapping("/user")
	public class IndexController {
		private Logger logger = Logger.getLogger(IndexController.class);
		@RequestMapping("/welcome")
		public String welcome(@RequestParam String username) {
			logger.info("welcome£¬username:" + username);
			return "index";
							}
	}
@Controller
 public class IndexController {
	private Logger logger = Logger.getLogger(IndexController.class);
	@RequestMapping(value="/welcome",method=RequestMethod.GET,params="username")
	public String welcome(@RequestParam String username) {
		logger.info("welcome," + username);
		return "index";
	}
}
@Controller
public class IndexController {
	private Logger logger = Logger.getLogger(IndexController.class);
	@RequestMapping("/welcome")
	public String welcome(@RequestParam(value="/welcome",required=false)String username) {
		logger.info("welcome," + username);
		return "index";
	}
}*/
@Controller
public class IndexController {
	private Logger logger = Logger.getLogger(IndexController.class);
	@RequestMapping("/index1")
	public ModelAndView index(String username) {
		logger.info("welcome! username:" + username);
		ModelAndView mav = new ModelAndView();
		mav.addObject("username",username);
		mav.setViewName("index");
		return mav	;
	}
}
//}

