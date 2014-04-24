package action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import po.User;
import service.IUserService;
import service.imp.UserService;
import util.SpringUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private String userId;
	private String userName;
	private String passWord;
	private String email;
	private User user = new User();
	private UserService userService;

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
		this.userService = (UserService) userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws Exception {

		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		userService = context.getBean("userService", UserService.class);
		if (userService.isUserExist(userName)) {
			return "USEREXIST";
		} else {
			if (userName == null || passWord == null) {
				return "NOTVOID";
			} else {
				user.setUserName(userName);
				user.setEmail(email);
				user.setPassWord(passWord);

				if (userService.registerUser(user)) {
					User userInfo = userService.getUserInfo(userName);
					Map session = ActionContext.getContext().getSession();
					session.put("userInfo", userInfo);
					return "RegisterDone";
				}
				return "RegisterError";
			}
		}
	}
}
