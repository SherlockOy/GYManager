package com.sherlockoy.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sherlockoy.po.User;
import com.sherlockoy.service.IUserService;
import com.sherlockoy.service.imp.UserService;

public class LoginAction extends ActionSupport {

	private String userId;
	private String userName;
	private String passWord;
	private String email;
	private User user;
	private IUserService userService = new UserService();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		if (userService.validateUser(userName, passWord)) {
			User userInfo = userService.getUserInfo(userName);
			Map session = ActionContext.getContext().getSession();
			session.put("userInfo", userInfo);
			return "SUCCESS";
		} else {
			return "ERROR";
		}
	}

}
