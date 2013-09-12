package com.sun.mysayy.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.GET;

import com.sun.mysayy.dto.Topic;

public class TopicListRes {
	
	@GET
	public Set<Topic> getTopicList(){
		Set<Topic> topicsForGenre = new HashSet<Topic>();
		return topicsForGenre;
	}

}
