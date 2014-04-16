package dao.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import po.User;
import util.HibernateUtil;
import dao.IUserDAO;

public class UserDAO implements IUserDAO {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
		HibernateUtil.closeSession();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(user);
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
		HibernateUtil.closeSession();

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(user);
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
		HibernateUtil.closeSession();
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		User user = (User)session.get(User.class, userId);
		HibernateUtil.closeSession();
		return user;
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		User user = (User)session.get(User.class, userName);
		HibernateUtil.closeSession();
		return user;
	}

	/*
	 * for the test
	 */
	/*public static void main(String[] args) {

		User user = new User();
		user.setUserName("userName");
		user.setPassWord("123");

		UserDAO userDAO = new UserDAO();
		userDAO.addUser(user);
	}
	*/
}
