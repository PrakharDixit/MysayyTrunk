package com.sun.mysayy.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.sun.mysayy.dto.Genre;


//The Java class will be hosted at the URI path "/genreList"
@Path("/genreList")
public class GenreListRes {

	// The Java method will process HTTP GET requests
	@GET
	public Set<Genre> getGenreList(){
		Set<Genre> currentGenres = new HashSet<Genre>();
		return currentGenres;
	}
}