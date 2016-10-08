package com.stw.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.stw.entity.User;
import com.stw.service.UserService;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Resource
	private UserService userService;

	private String username = "test";
	private String password = "test";

	public String login() {
		HttpServletRequest request = ServletActionContext.getRequest();
		User user = userService.findUserByNameAndPassword(username, password);
		System.out.println(user);
		if (null == user) {
			return ERROR;
		}
		// 携带数据
		request.setAttribute("username", user.getUserName());
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
