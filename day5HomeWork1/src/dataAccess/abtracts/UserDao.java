package dataAccess.abtracts;

import entities.concretes.User;

public interface UserDao {
	
	void save(User user);
	void delete(User user);
	void update(User user);

}
