package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IUserDAO;
import domain.User;

public class UserDAO implements IUserDAO {
	public UserDAO(){
		
	}

	public void addUser(User user)  {
		Connection conn = new DatabaseDAO().getConnection();	
		PreparedStatement pstmt = null;
		String sql = "insert into users(username, password, realname, gender, age, personalsignature)"
				+ "values('"
				+user.getUserName()
				+"','"
				+user.getPassword()
				+"','"
				+user.getRealName()
				+"','"
				+user.getGender()
				+"','"
				+user.getAge()
				+"','"
				+user.getPersonalSignature()
				+"')";
		System.out.println("sql query "+ sql);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
				pstmt.close();
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	public User getUserById(String id) {
		Connection conn = new DatabaseDAO().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User us = new User();
		String sql = "select * from users where id = "+id+ "";
		try {
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			if(rs.next()){
				us.setId(rs.getString("id"));
				us.setGender(rs.getString("gender"));
				us.setAge(rs.getInt("age"));
				us.setPassword(rs.getString("password"));
				us.setPersonalSignature(rs.getString("personalsignature"));
				us.setRealName(rs.getString("realname"));
				us.setUserName(rs.getString("username"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return us;
	}

	public List<User> getUserByUserName(String userName) {
		System.out.println("Get the name: "+ userName);
		DatabaseDAO myDB = new DatabaseDAO();
		User user = new User();
		
		List<User> list = new ArrayList<User>();
		String sql = "select * from users where username = '"+ userName + "'";
		try {
			ResultSet mySet = myDB.getResultSet(sql);
			while(mySet.next()){
				user.setId(mySet.getString("id"));
				user.setUserName(mySet.getString("username"));
				user.setAge(mySet.getInt("age"));
				user.setGender(mySet.getString("gender"));
				user.setPassword(mySet.getString("password"));
				user.setPersonalSignature(mySet.getString("personalsignature"));
				user.setRealName(mySet.getString("realname"));
				list.add(user);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				myDB.releaseConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("size of the list: "+list.size());
		return list;
	}
	
//	public static void main(String[] args) {
//		UserDAO ud= new UserDAO();
////		User user = new User("John", "12345", "John Real", "m", 25, "Johnnn");
////		ud.addUser(user);
//		
////		User user=ud.getUserById("2");
////		System.out.println(user);
//		
//		List<User> list=ud.getUserByUserName("John");
//		for(User u:list){
//			System.out.println(u);
//		}
//		
//	}

}
