package service.imp;

import po.User;
import dao.IUserDAO;
import dao.imp.UserDAO;
import service.IUserService;

public class UserService implements IUserService {

	//private IUserDAO userDAO; // 待改回来

	private IUserDAO userDAO = new UserDAO(); //for test

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
		String name = user.getUserName();
		boolean judge = isUserExist(name);
		if (judge) {
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

	@Override
	public User getUserInfo(String userName) {
		// TODO Auto-generated method stub
		User user = userDAO.getUserByUserName(userName);
		User userInfo = new User();

		userInfo.setUserId(user.getUserId());
		userInfo.setUserName(userName);
		userInfo.setEmail(user.getEmail());
		return userInfo;
	}

	// public static void main(String[] args) {
	//
	// UserService userService = new UserService();
	// User testUser = new User();
	// testUser.setUserName("rocket0");
	// testUser.setPassWord("123");
	// testUser.setEmail("oyang716@163.com");
	//
	// boolean resultOfIsUserExist = userService.isUserExist("testupdate");
	// boolean resultOfRegisterUser = userService.registerUser(testUser);
	// boolean resultOFValidateUser = userService.validateUser("testupdate",
	// "123");
	//
	// System.out.println(resultOfIsUserExist);
	// System.out.println(resultOfRegisterUser);
	// System.out.println(resultOFValidateUser);
	//
	// }

}
