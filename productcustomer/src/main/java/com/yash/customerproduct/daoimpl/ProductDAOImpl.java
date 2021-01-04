package com.yash.customerproduct.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.customerproduct.dao.ProductDAO;
import com.yash.customerproduct.model.Customer;
import com.yash.customerproduct.model.Product;
@Component
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	JdbcTemplate template;
	@Autowired
	Customer customer;

	@Override
	public void save(Product product) {
		//System.out.println(product.getName());
		//System.out.println(Product.value);
		String sql="insert into products(userid,name) values((select id from customers where id="+Product.value+"),'"+product.getName()+"')";  	
		template.update(sql);  		
	}

	@Override
	public List<Product> findAll() {
		return template.query("select * from products",new RowMapper<Product>(){    
			public Product mapRow(ResultSet rs, int row) throws SQLException {  
				Product p=new Product();    
				p.setId(rs.getInt(1));    
				p.setUserid(rs.getInt(2));    
				p.setName(rs.getString(3));  
				//System.out.println(p.getId());
				//System.out.println(p.getName());
				//System.out.println(p.getUserid());

				return p; 
			}});
	}

}
