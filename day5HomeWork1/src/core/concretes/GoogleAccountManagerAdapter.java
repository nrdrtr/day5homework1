package core.concretes;

import Google.GoogleAccountManager;
import core.abstracts.GoogleAccountService;

public class GoogleAccountManagerAdapter implements GoogleAccountService{

	@Override
	public void logToSystem(String message) {
		GoogleAccountManager user = new GoogleAccountManager();
		user.register(message);
		
	}

}
