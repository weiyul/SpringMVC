package service.imp;

import java.util.List;

import dao.IUserDAO;
import dao.imp.UserDAO;
import domain.User;
import service.IUserService;

public class UserService implements IUserService {
	private IUserDAO userDAO = new UserDAO();
	public UserService(){
		
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		if(user == null){
			return;
		}
		//if the user's id is not null, this means the user exists in the database, should return
		if(user.getId() != null){
			return;
		}
		String userName = user.getUserName();
		List<User> users = userDAO.getUserByUserName(userName);
		if(users.size()<=0){
			userDAO.addUser(user);
		}else{
			throw new RuntimeException("this user exists, please change the user name");
		}
	}

	public User getUserByID(String id) {
		// TODO Auto-generated method stub
		if(id == null){
			return null;
		}
		return userDAO.getUserById(id);
	}

	public User validateUser(String userName, String password) {
		// TODO Auto-generated method stub
		List<User> users = userDAO.getUserByUserName(userName);
		if(users != null && users.size()!=0){
			if(users.get(0).getPassword().equals(password)){
				return users.get(0);
			}else{
				return null;
			}
		}else{
			return null;
		}
		
	}

	public boolean isUserExist(String userName) {
		// TODO Auto-generated method stub
		List<User> users = userDAO.getUserByUserName(userName);
		if(users.size() !=0)
			return true;
		else
			return false;
		
	}


}
