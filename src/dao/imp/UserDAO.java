package dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import po.User;
import dao.IUserDAO;

public class UserDAO implements IUserDAO {

	
	private SessionFactory sessionFactory;
	//默认构造函数
	public UserDAO(){
	}
	
	// 添加用户
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
		session.close();
	}

	// 更新用户
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.update(user);
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
		session.close();

	}

	// 删除用户
	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.delete(user);
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
		session.close();
	}

	// 根据ID获取用户对象
	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, userId);

		session.close();
		return user;
	}

	// 根据用户名获取用户对象
	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User where userName = ?");
		query.setString(0, userName);
		List list = query.list();
		session.close();
		if (list.size() > 0) {
			return (User) list.get(0);
		} else
			return null;
	}

	/*
	 * for the test
	 */

	// public static void main(String[] args) {
	//
	// User user = new User();
	// user.setUserName("userName");
	// user.setPassWord("123");
	//
	// UserDAO userDAO = new UserDAO();
	// userDAO.addUser(user);
	//
	// String theId = user.getUserId();
	// User beforeUpdatedUser = userDAO.getUserById(theId);
	// System.out.println("before update is " + beforeUpdatedUser);
	//
	// User updatedUser = userDAO.getUserById(theId);
	// updatedUser.setUserName("testupdate2");
	// userDAO.updateUser(updatedUser);
	// System.out.println("updated user is " + updatedUser);
	//
	// User fetchUser = userDAO.getUserByUserName("testupdate");
	// System.out.println("fetched user is " + fetchUser);
	//
	// }

}
