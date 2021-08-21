package javaCourse_D5H1.business.concretes;

import java.util.ArrayList;
import java.util.List;

import javaCourse_D5H1.business.abstracts.EmailVerificationService;
import javaCourse_D5H1.entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService {

	List<String> verificatedEmail = new ArrayList<String>();
	
	@Override
	public void sendToVerifyEmail(User user) {
		System.out.println(user.getEmail() + " adresine dogrulama maili gonderildi");
		
	}

	@Override
	public void verifyEmail(User user) {
		verificatedEmail.add(user.getEmail());
		System.out.println(user.getEmail() + " adresi basariyla dogrulandi");
		
	}

	@Override
	public boolean checkVerifyAccount(User user) {
		if (verificatedEmail.contains(user.getEmail())) {
			return true;
		}
		return false;
	}

}
