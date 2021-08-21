package javaCourse_D5H1.business.concretes;

import javaCourse_D5H1.business.abstracts.EmailVerificationService;
import javaCourse_D5H1.business.abstracts.UserCheckService;
import javaCourse_D5H1.business.abstracts.UserService;
import javaCourse_D5H1.dataAccess.abstracts.UserDao;
import javaCourse_D5H1.entities.concretes.User;

public class UserManager implements UserService {

	UserCheckService userCheckService;
	EmailVerificationService emailVerificationService;
	UserDao userDao;

	public UserManager(UserCheckService userCheckService, EmailVerificationService emailVerificationService,
			UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.emailVerificationService = emailVerificationService;
		this.userDao = userDao;
	}

	UserCheckManager userCheckManager;

	@Override
	public void signIn(User user) {
		
		emailVerificationService.verifyEmail(user);
		
		if (userDao.getEmail(user.getEmail()) && userDao.getPassword(user.getPassword())
				&& emailVerificationService.checkVerifyAccount(user)==true) {
			System.out.println("Kullanýcý girisi basariyla yapildi");
		} 
		
		else if (emailVerificationService.checkVerifyAccount(user) == false) {
			System.out.println("Kullanici bilgileri dogru fakat email adresi dogrulanmamis");
		}
		
		else{System.out.println("Kullanici bilgileri yanlis lutfen kontrol ediniz!");}
	}

	@Override
	public void login(User user) {

		if (userCheckService.isValid(user) == true) {
			System.out.println("Kullanýcý baþarýyla eklendi : " + user.getFirstName());
			emailVerificationService.sendToVerifyEmail(user);
			userDao.add(user);
		} else {
			System.out.println("Kullanýcý sisteme eklenemedi");
		}

	}

}
