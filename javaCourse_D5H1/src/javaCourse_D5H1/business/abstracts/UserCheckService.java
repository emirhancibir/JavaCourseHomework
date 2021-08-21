package javaCourse_D5H1.business.abstracts;

import javaCourse_D5H1.entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmail(User user);
	boolean uniqueEmail(User user);
	boolean checkPassword(User user);
	boolean isValid(User user);
}
