package dao;

import java.util.List;

import domain.User;

public interface IUserDAO {
	//add a user to the database
	public void addUser(User user);
	
	public User getUserById(String Id);
	public List<User> getUserByUserName(String userName);

}
