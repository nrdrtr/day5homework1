package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import business.abstracts.UserCheckService;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean firstNameCheck(User user) {
		if(user.getFirstName().length()>=2) {
			return true;
		}else {
			
			System.out.println("isminiz en az 2 haneden oluþmalýdýr");
		
		return false;
		}
	}

	@Override
	public boolean lastNameCheck(User user) {
		if(user.getLastName().length()>=2) {
			return true;
		}else {
			
			System.out.println("soy isminiz en az 2 haneden oluþmalýdýr");
		
		return false;
		}
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}else {
			
			System.out.println("þifreniz en az 6 haneden oluþmalýdýr");
		
		return false;
		}
	}
	
	@Override
	public boolean eMailCheck(User user) {
		
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);

		Matcher matcher = pattern.matcher(user.geteMail());
		if (matcher.matches() == true) {
			return true;
		}

		return false;
	
	}
	


	}


                












