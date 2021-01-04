/*
package com.yash.nutritionappspring.helper;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.nutritionappspring.model.WeightLog;
import com.yash.nutritionappspring.util.MenuUtil;
@Component
public class WeightLogAvailability {
	@Autowired
	MenuUtil menuUtil;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	/**
	 * This Method checks whether your userid for weightlog exists in database or not.
	 * Restricts Duplication of userid values.
	 */ 
	 
	
	/**
	 * This Method checks weather given userid by user already registered with the App.
	 * If it does exist you cannot ragister for the same.
	 * @param userId
	 */
	
/**	public void checkUserIdSave(String userId) 
	{
		String sql="select userid from weightlog where userid=?";
		jdbcTemplate.query("select * from weightlog",new RowMapper<WeightLog>()
	        if(rs.next())
	        {
	        	System.out.println("This userId Already Exists. TRY AGAIN");
	        	menuUtil.start();
	        }
	        else
	        {
	        	
	        	System.out.println("This userId Available for Save");
	        }
	        
	     }

	     
	       
	 
	
	/**
	 * This method checks If the userId entered by user is ragistered with app.
	 * If ragistered , will process your display,update or delete request.
	 * If not, will send you to menu again.
	 * @param userId
	 */
	
	/**public void checkUserIdExists(String userId) 
	{
		
	    try
	    {
	    	
	        if(rs.next())
	        {
	        	System.out.println("This user id exists in database.  ");
	        	
	        }
	        else
	        {
	        	System.out.println("This user id doesn't exist");
	        	menuUtil.start();
	        }
	        
	     }

	     catch (SQLException e) 
	     {
	        System.out.println("SQL Exception: "+ e.toString());
	     
	 }

})*/
