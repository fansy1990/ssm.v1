package demo.controller;

import java.util.List;

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

	@RequestMapping(value = "insert")
	public ModelAndView testInsert(String userName, int age) {
		ModelAndView modelAndView = null;
		int ret = this.userService.insert(new User(userName, age));
		if (ret > 0) {
			modelAndView = new ModelAndView("success");
			modelAndView.addObject("num", ret);
			return modelAndView;
		}

		return new ModelAndView("error");
	}

	@RequestMapping(value = "delete")
	public ModelAndView testDelete(int id) {
		ModelAndView modelAndView = null;
		int ret = this.userService.delete(id);
		if (ret > 0) {
			modelAndView = new ModelAndView("success");
			return modelAndView;
		}

		return new ModelAndView("error");
	}

	@RequestMapping(value = "update")
	public ModelAndView testUpdate(int id, String userName, int age) {
		ModelAndView modelAndView = null;
		int ret = this.userService.update(new User(id, userName, age));
		if (ret > 0) {
			modelAndView = new ModelAndView("success");
			return modelAndView;
		}

		return new ModelAndView("error");
	}

	@RequestMapping(value = "query")
	public ModelAndView testQuery() {
		ModelAndView modelAndView = null;
		List<User> ret = this.userService.query();
		if (ret.size() > 0) {
			modelAndView = new ModelAndView("success");
			modelAndView.addObject("ret", ret);
			return modelAndView;
		}

		return new ModelAndView("error");
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
