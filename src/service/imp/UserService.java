package service.imp;

import po.User;
import dao.IUserDAO;
import dao.imp.UserDAO;
import service.IUserService;

public class UserService implements IUserService {

	private IUserDAO userDAO;

	// 使用setter进行注入
	@Override
	public void setUserDAO(UserDAO userDAO) {
		// TODO Auto-generated method stub
		this.userDAO = userDAO;
	}

	// 注册防止重复用户名
	@Override
	public boolean isUserExist(String userName) {
		// TODO Auto-generated method stub
		if (userDAO.getUserByUserName(userName) == null) {
			return false;
		} else
			return true;
	}

	// 注册新用户
	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		if (isUserExist(user.getUserName())) {
			return false;
		} else {
			userDAO.addUser(user);
			return true;
		}
	}

	// 验证登录
	@Override
	public boolean validateUser(String userName, String passWord) {
		// TODO Auto-generated method stub
		User user = userDAO.getUserByUserName(userName);
		if (user.getPassWord().equals(passWord)) {
			return true;
		} else {
			return false;
		}
	}
}
