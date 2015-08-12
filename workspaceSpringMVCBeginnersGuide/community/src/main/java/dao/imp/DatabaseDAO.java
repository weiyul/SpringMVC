package dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDAO {
	private Connection conn = null;
	public Connection getConnection() {
		Connection conn = null;
		//load the database driver
		try {
			Class.forName("org.postgresql.Driver");
			//initialize database connection string and indicate character encoding
			String connstr = "jdbc:postgresql://127.0.0.1:5432/community?useUnicode=true&characterEncoding=utf-8";
			String user = "postgres";
			String password = "postgres";
			conn = DriverManager.getConnection(connstr, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection created!");
		return conn;
	}
	
	public void releaseConnection() throws SQLException{
		this.conn.close();
		this.conn = null;
		
	}
	
	public ResultSet getResultSet(String querySQL) throws SQLException, ClassNotFoundException{
		if(conn == null){
			this.conn = getConnection();
		}
		Statement stm = conn.createStatement();
		ResultSet thisRST = stm.executeQuery(querySQL);
		
		return thisRST;
	}
	
	public void executeSQL(String SQL) throws SQLException, ClassNotFoundException{
		if(conn == null){
			this.conn = getConnection();
			
		}
		Statement stm = conn.createStatement();
		stm.executeUpdate(SQL);
		this.conn.close();
		this.conn=null;
	}
	
	public static void main(String[] args){
		DatabaseDAO myDb = new DatabaseDAO();
		try{
			myDb.conn = myDb.getConnection();
			
			myDb.releaseConnection();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
}
