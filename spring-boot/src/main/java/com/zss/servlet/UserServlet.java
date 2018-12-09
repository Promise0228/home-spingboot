package com.zss.servlet;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zss.pojo.UserInfo;
import com.zss.service.UserService;

@Controller
public class UserServlet{
    @Autowired
    UserService userService;
    
	@RequestMapping("/test")
	@ResponseBody
	public String test(UserInfo userinfo) throws UnknownHostException {
		userService.addUser(userinfo);
		
		return "ok";
	}
}
