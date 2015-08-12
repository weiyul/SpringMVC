package dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.IInfoDAO;
import domain.Information;
import domain.User;

public class InfoDAO implements IInfoDAO {

	public InfoDAO(){
		
	}
	public void addInfo(Information info) {
		// TODO Auto-generated method stub
		String format=("yyyy-MM-dd hh:mm:ss");
		Date stringToDate = new Date(info.getPublishingTime());
		String myTime = new SimpleDateFormat(format).format(stringToDate);
		DatabaseDAO myDB = new DatabaseDAO();
		String sql ="insert into information(title, content, publishingtime, publishinguser, type) values('"
		+info.getTitle()+"','"
		+info.getContent()+"','"
		+myTime+"','"
		+info.getPublishingUser().getUserName()+"','"
		+info.getType()+"')"
		;
		
		try {
			myDB.executeSQL(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Information> getInfoBySqlString(String sql){
		// TODO Auto-generated method stub
		
		DatabaseDAO myDB = new DatabaseDAO();
		List<Information> list = new ArrayList<Information>();
		try {
			ResultSet mySet = myDB.getResultSet(sql);
			while(mySet.next()){
				Information info= new Information();
				info.setId(mySet.getString(1));
				info.setTitle(mySet.getString(2));
				info.setContent(mySet.getString(3));
				info.setPublishingTime(mySet.getString(4));
				User user = new User();
				user.setUserName(mySet.getString(5));
				info.setPublishingUser(user);
				info.setType(mySet.getString(6));
				list.add(info);
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
		return list;
	}
	public List<Information> getAllInfo() {
		// TODO Auto-generated method stub
		
		String sql = "select * from information";
		return getInfoBySqlString(sql);
	}
	
//	//test the above function
//	public static void main(String[] args) {
//		//String title, String content,String publishingTime, User publishingUser
//		
//		User user = new User("John22", "12345", "John Real22", "m", 25, "Johnnn");
//		Date today = new Date();
//		Information info= new Information("Mr","content",today.toString(), user, "text");
//
//		InfoDAO iDAO= new InfoDAO();
//		//iDAO.addInfo(info);
//		String sql= "select * from information ";
//		List<Information> list = iDAO.getAllInfo();
//		for(Information inf: list){
//			System.out.println(info);
//		}
//		
//		
//	}

}
