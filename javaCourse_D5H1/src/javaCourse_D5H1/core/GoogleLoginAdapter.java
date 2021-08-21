package javaCourse_D5H1.core;

import java.util.ArrayList;
import java.util.List;

import javaCourse_D5H1.business.abstracts.EmailVerificationService;
import javaCourse_D5H1.entities.concretes.User;

public class GoogleLoginAdapter implements EmailVerificationService {
	
	List<String> verificatedEmails = new ArrayList<String>();
	
	@Override
	public void sendToVerifyEmail(User user) {
		System.out.println(user.getUserId()+"Dogrulama maili gonderildi");
		
	}

	@Override
	public void verifyEmail(User user) {
		verificatedEmails.add(user.getEmail());
		System.out.println(user.getFirstName()+ ' '+ user.getLastName()+" kullanicisi basariyla dogrulandi.");
		
	}

	@Override
	public boolean checkVerifyAccount(User user) {
		if (verificatedEmails.contains(user.getEmail())) {
			return true;
		}
		return false;
	}

}
