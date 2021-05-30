
import business.abstracts.UserService;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import core.concretes.GoogleAccountManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1= new User(1, "nurullah", "diri", "nuri@58gmail.com", "585858");
		User user2 = new User(2, "engin", "demirog", "engindemirog01@gmail.com", "010101");
		
		UserService userservice = new UserManager( new HibernateUserDao(),new GoogleAccountManagerAdapter(),
				new UserCheckManager());
		
		userservice.register(user1);
		userservice.register(user2);
	}

}
