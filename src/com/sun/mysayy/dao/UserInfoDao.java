package com.sun.mysayy.dao;

import java.sql.*;

import com.sun.mysayy.dto.User;
public class UserInfoDao {
	private static ResultSet resultSet = null;


	public static User getUserInfo(){
		User user = new User();
		String url = "jdbc:mysql://25.94.253.22:3306/";
		String dbName = "mysayy";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "P@ssw0rd";
		String username = "";
		String useremailid = "";
		try {
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url+dbName,userName,password);
//			System.out.println(conn.prepareCall("select * from mysayy.user"));
			PreparedStatement statement = conn.prepareStatement("SELECT username,useremailid FROM mysayy.user");
			resultSet = statement.executeQuery();
			while(resultSet.next()){
			 username = resultSet.getString("username");
			 useremailid = resultSet.getString("useremailid");
			}
			
			user.setEmailId(useremailid);
			user.setUserName(username);
			System.out.println(username + " " + useremailid);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public static void setUserInfo(User user){
		// Used to set user info
	}

}
