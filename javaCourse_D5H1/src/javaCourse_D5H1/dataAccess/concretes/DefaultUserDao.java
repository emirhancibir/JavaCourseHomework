package javaCourse_D5H1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import javaCourse_D5H1.dataAccess.abstracts.UserDao;
import javaCourse_D5H1.entities.concretes.User;

public class DefaultUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	

	@Override
	public void add(User user) {
		System.out.println("User added : " + user.getFirstName());
		users.add(user);

	}

	@Override
	public void update(User user) {
		System.out.println("User updated : " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted : " + user.getFirstName());

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getEmail(String email) {

		for (User user : users) {
			if (user.getEmail() == email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for (User user : users) {
			if (user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

}
