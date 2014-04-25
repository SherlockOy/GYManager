package com.sherlockoy.dao;

import com.sherlockoy.po.User;

public interface IUserDAO {

	//add user to db
	public void addUser(User user);
	//update info of user in db
	public void updateUser(User user);
	//delete user from db
	public void deleteUser(User user);
	//get user object by id
	public User getUserById(String userId);
	//get user object by username
	public User getUserByUserName(String userName);
}
