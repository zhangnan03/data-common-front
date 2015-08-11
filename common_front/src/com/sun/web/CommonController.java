package com.sun.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.base.web.BaseController;
import com.sun.entity.User;
import com.sun.service.UserService;

@Controller
public class CommonController extends BaseController {
	@Autowired
	private UserService userService;
	private static Logger logger = LoggerFactory.getLogger(CommonController.class);
	/**
	 * 登录页面
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request, ModelMap model) {
		logger.info("首页");
		User member = userService.findByUserName("zhangnan");
		System.out.println(member.getUserName());
		return "/index";
	}
	/**
	 * 主页
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "main";
	}
}