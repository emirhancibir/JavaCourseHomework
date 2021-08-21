package javaCourse_D5H1;

import javaCourse_D5H1.business.concretes.EmailVerificationManager;
import javaCourse_D5H1.business.concretes.UserCheckManager;
import javaCourse_D5H1.business.concretes.UserManager;
import javaCourse_D5H1.dataAccess.concretes.DefaultUserDao;
import javaCourse_D5H1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Emirhan", "Cibir", "emirhancibir@gmail.com", "123456");
		User user2 = new User(2, "Mahmut", "Gates", "mahmut.gates@gmail.com", "199814");
		User user3 = new User(3, "Zeki", "Fener", "karakartal54@hotmail.com", "14531999");
		User user4 = new User(4, "Emre", "Yaman", "karakartal54@hotmail.com", "987654");

		UserManager userManager = new UserManager(new UserCheckManager(), new EmailVerificationManager(), new DefaultUserDao());
		
		userManager.login(user3);
		userManager.login(user4);
//		userManager.signIn(user3);
//		userManager.signIn(user4);
	}

}
