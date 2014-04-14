package dao;

import domain.User;

public interface IUserDAO {

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public User getUserById(String userId);

	public User getUserByUserName(String userName);
}
