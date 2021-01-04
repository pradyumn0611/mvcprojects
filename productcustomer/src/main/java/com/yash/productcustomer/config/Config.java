package com.yash.productcustomer.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.yash.customerproduct.daoimpl.CustomerDAOImpl;
import com.yash.customerproduct.daoimpl.ProductDAOImpl;
import com.yash.customerproduct.model.Customer;

@Configuration
@EnableWebMvc
@ComponentScan("com.yash")
public class Config extends WebMvcConfigurerAdapter {
	@Bean
	public CustomerDAOImpl customerDAOImpl()
	{
		return new CustomerDAOImpl();
	}
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
		
	}
	@Bean
	public ProductDAOImpl productDAOImpl()
	{
		return new ProductDAOImpl();
	}
	@Bean
	public Customer customer()
	{
		return new Customer();
	}
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/customerproductdb");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	

}
