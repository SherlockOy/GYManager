package dao.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import po.User;
import dao.IUserDAO;

public class UserDAO implements IUserDAO {

	protected Session getSession() {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		return session;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.getSession().save(user);

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.getSession().update(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return (User) this.getSession().get(User.class, userId);
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
