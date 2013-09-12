package com.sun.mysayy.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Request;

import com.sun.mysayy.dao.UserInfoDao;
import com.sun.mysayy.dto.User;


//The Java class will be hosted at the URI path "/userInfo"
@Path("/userInfo")
public class UserInfoRes {

	// The Java method will process HTTP GET requests
	@GET
	public User getUserInfo(){
		User user = UserInfoDao.getUserInfo();
		return user;
	}
	// The Java method will produce content identified by the MIME Media
	// type "text/plain"
	@Produces("text/plain")
	public User setUserInfo(Request request) {
		// Create new user info
		User user = new User();
		UserInfoDao.setUserInfo(user);
		return user;
	}
}