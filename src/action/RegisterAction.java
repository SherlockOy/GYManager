package action;

import po.User;
import service.IUserService;
import service.imp.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private String userId;
	private String userName;
	private String passWord;
	private String email;
	private IUserService userService = new UserService();
	private User user;

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

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws Exception {
		if (userService.isUserExist(userName)) {
			return "USEREXIST";
		} else {
			if (userName == null || passWord == null) {
				return "NOTVOID";
			} else {
				user.setUserName(userName);
				user.setEmail(email);
				user.setPassWord(passWord);

				if (userService.registerUser(user))
					return "RegisterDown";
				return "RegisterERROR";
			}
		}
	}
}
