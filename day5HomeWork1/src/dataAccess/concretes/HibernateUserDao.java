package dataAccess.concretes;

import dataAccess.abtracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("hibernate ile kaydedildi "+user.getFirstName());
	
	}

	@Override
	public void delete(User user) {
		System.out.println("hibernate ile silindi "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("hibernate ile güncellendi "+user.getFirstName());
		
	}

	

}
