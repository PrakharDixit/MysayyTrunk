package com.sun.mysayy.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.sun.mysayy.dto.Topic;

@Path("/newReleases")
public class NewReleasesRes {

	@GET
	public Set<Topic> getTopicList(){
		Set<Topic> newTopics = new HashSet<Topic>();
		return newTopics;
	}
	
}
