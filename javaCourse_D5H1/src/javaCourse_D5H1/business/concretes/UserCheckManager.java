package javaCourse_D5H1.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCourse_D5H1.business.abstracts.UserCheckService;
import javaCourse_D5H1.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	List<String> listOfEmail = new ArrayList<String>();
	
	@Override
	public boolean checkFirstName(User user) {
		boolean result = user.getFirstName().isEmpty();
		if (result) {
			System.out.println("Ad alaný bos birakilamaz");
			return false;
		} else if (user.getFirstName().length() <= 2) {
			System.out.println("Ad ve soyad en az iki karakterden oluþmalýdýr");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		boolean result = user.getFirstName().isEmpty();
		if (result) {
			System.out.println("Soyad alaný bos birakilamaz");
			return false;
		} else if (user.getFirstName().length() <= 2) {
			System.out.println("Ad ve soyad en az uc karakterden oluþmalýdýr");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());

		boolean result = matcher.matches();

		if (user.getEmail().isBlank()) {
			System.out.println("Email alaný boþ býrakýlamaz");
			return false;
		} else {
			if (result == false) {
				System.out.println("Eposta alaný eposta formatýnda deðil");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {

			if (listOfEmail.contains(user.getEmail())) {
				System.out.println("Bu eposta ile daha önce sisteme kayýt olunmuþ");
				return false;
			}else {
				listOfEmail.add(user.getEmail());
				return true;
			}
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().isEmpty()) {
			System.out.println("Parola alaný boþ býrakýlamaz");
			return false;
		}else if (user.getPassword().length() <= 5 ) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr");
			return false;
		}
		return true;
	}

	@Override
	public boolean isValid(User user) {
		if (checkFirstName(user) && checkLastName(user) && checkEmail(user) && uniqueEmail(user) && checkPassword(user) == true) {
			return true;
		}
		return false;
	}

}
