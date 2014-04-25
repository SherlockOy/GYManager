package com.sherlockoy.service;

import com.sherlockoy.dao.imp.UserDAO;
import com.sherlockoy.po.User;

public interface IUserService {
	// 注册防止出现重复用户名
	public boolean isUserExist(String userName);

	// 使用DAO进行注入
	public void setUserDAO(UserDAO userDAO);

	// 注册业务方法
	public boolean registerUser(User user);

	// 验证登录
	public boolean validateUser(String userName, String passWord);
	// 查询订单，返回订单列表

	public User getUserInfo(String userName);
	
}
