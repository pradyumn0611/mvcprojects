package com.yash.customerproduct.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.customerproduct.dao.CustomerDAO;
import com.yash.customerproduct.model.Customer;
@Component
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	JdbcTemplate template;

	

	@Override
	public void save(Customer customer) {
		String sql="insert into customers(id,name) values("+customer.getId()+",'"+customer.getName()+"')";  	
		template.update(sql);  
	}

	@Override
	public List<Customer> findAll() {
		return template.query("select * from customers",new RowMapper<Customer>(){    
			public Customer mapRow(ResultSet rs, int row) throws SQLException {  
				Customer c=new Customer();    
				c.setId(rs.getInt(1));    
				c.setName(rs.getString(2));  


				return c; 
			}});
		

	}

}
