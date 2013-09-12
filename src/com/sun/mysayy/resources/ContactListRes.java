package com.sun.mysayy.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.sun.mysayy.dto.User;

@Path("/contactList")
public class ContactListRes {

	@GET
	public Set<User> getcontactList(){
		Set<User> contactListforUser = new HashSet<User>();
		return contactListforUser;
	}
	
	
}
