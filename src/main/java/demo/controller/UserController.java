package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demo.model.User;
import demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView login(String username, String password) {

		if (this.checkParams(username, password)) {
			ModelAndView mav = new ModelAndView("success");
			mav.addObject("username", username);
			mav.addObject("password", password);
			return mav;
		}
		return new ModelAndView("home");

	}

	private boolean checkParams(String userName, String password) {
		User user = this.userService.getUser(userName);
		System.out.println(user.getId());
		return true;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
