package com.sun.mysayy.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class TopicInfoDao {

	private JdbcTemplate jdbctemplate;

	/**
	 * @param jdbctemplate the jdbctemplate to set
	 */
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
}
