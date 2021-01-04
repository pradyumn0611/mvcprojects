package com.yash.nutritionappspring.configuration;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.yash.nutritionappspring.dao.WeightLogDAO;
import com.yash.nutritionappspring.daoimpl.WeightLogDAOImpl;
import com.yash.nutritionappspring.helper.WeightLogCases;
import com.yash.nutritionappspring.model.WeightLog;
import com.yash.nutritionappspring.service.WeightLogService;
import com.yash.nutritionappspring.serviceimpl.WeightLogServiceImpl;
import com.yash.nutritionappspring.util.MenuUtil;
@Configuration
public class Config {
	
	@Bean
	public MenuUtil menuUtil()
	{
		return new MenuUtil();
	}
	
	@Bean
	public WeightLogCases weightLogCases()
	{
		return new WeightLogCases();
	}

	//@Bean
//	public WeightLogAvailability weightLogAvailability()
	//{
		//return new WeightLogAvailability();
	//}
	
	@Bean
	public WeightLogService weightLogService()
	{
		return new WeightLogServiceImpl();
	}
	@Bean
	public WeightLog weightLog()
	{
		return new WeightLog();
	}
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
		
	}
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/nutritionapp");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	@Bean
	public WeightLogDAO weightLogDAO()
	{
		return new WeightLogDAOImpl();
	
	}

}
