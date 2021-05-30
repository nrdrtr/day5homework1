package business.concretes;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import core.abstracts.GoogleAccountService;
import dataAccess.abtracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	GoogleAccountService googleAccountService;
	UserCheckService userCheckService;

	 public UserManager(UserDao userDao, GoogleAccountService googleAccountService, UserCheckService userCheckService) {
		super();
		this.userDao = userDao;
		this.googleAccountService = googleAccountService;
		this.userCheckService = userCheckService;
	}

	@Override
	public void register(User user) {
		if(userCheckService.firstNameCheck(user)==true &&
				userCheckService.lastNameCheck(user)==true &&
				userCheckService.eMailCheck(user)==true &&
				userCheckService.passwordCheck(user)==true){
			System.out.println("giriþ baþarýlý");
		}else {
			System.out.println("bilgilerinizi kontrol ediniz");
		}
		
	}

	@Override
	public void login(String eMail, String password,User user) {
		if(userCheckService.eMailCheck(user)==true &&		
				 userCheckService.passwordCheck(user)==true) {
				System.out.println("kaydýnýz baþarýyla gerçekleþtirilmiþtir");
				}else {
					System.out.println("bilgilerinizi kontrol ediniz");
				} 
		
	}


	}

	

	

