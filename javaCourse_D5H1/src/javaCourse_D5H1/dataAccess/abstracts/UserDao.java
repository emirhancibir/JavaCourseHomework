package javaCourse_D5H1.dataAccess.abstracts;

import java.util.List;

import javaCourse_D5H1.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	boolean getEmail(String email);
	boolean getPassword(String password);
	List<User> getAll();
}
