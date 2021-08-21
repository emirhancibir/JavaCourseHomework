package javaCourse_D5H1.business.abstracts;

import javaCourse_D5H1.entities.concretes.User;

public interface EmailVerificationService {
	void sendToVerifyEmail(User user);
	void verifyEmail(User user);
	boolean checkVerifyAccount(User user);
	
}
