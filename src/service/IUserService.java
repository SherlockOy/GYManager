package service;

public interface IUserService {
		//注册防止出现重复用户名
		public boolean isUserExist(String userName);
		//验证登录
		public boolean validateUser(String userName, String passWord);
		//查询订单，返回订单列表
		
	}

