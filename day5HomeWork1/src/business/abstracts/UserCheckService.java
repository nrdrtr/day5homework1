package business.abstracts;

import entities.concretes.User;

public interface UserCheckService {
	
	boolean firstNameCheck(User user);
	boolean lastNameCheck(User user);
	boolean passwordCheck(User user);
	boolean eMailCheck(User user);

}
