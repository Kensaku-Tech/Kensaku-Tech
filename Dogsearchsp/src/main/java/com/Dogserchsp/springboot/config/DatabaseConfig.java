package com.Dogserchsp.springboot.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DatabaseConfig {

	@Autowired
	DataSource dataSource;


}
