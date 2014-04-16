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
		session.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		session.update(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		session.delete(user);
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return (User) HibernateUtil.getSession().get(User.class, userId);
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return (User) HibernateUtil.getSession().get(User.class, userName);
	}

	public static void main(String[] args){
		
		User user = new User();
		user.setUserName("userName");
		user.setPassWord("123");
		
		UserDAO userDAO = new UserDAO();
		userDAO.addUser(user);
	}
	
}
