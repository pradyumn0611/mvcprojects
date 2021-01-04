package com.yash.nutritionappspring.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.nutritionappspring.dao.WeightLogDAO;
import com.yash.nutritionappspring.model.WeightLog;
@Component
public class WeightLogDAOImpl implements WeightLogDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(WeightLog weightLog) {
		String sql="insert into weightlog(weight,created_At,updated_At,userid) values("+weightLog.getWeight()+",'"+weightLog.getCreated_At()+"','"+
				weightLog.getUpdated_At()+"',"+weightLog.getUserId()+")";  	
		jdbcTemplate.update(sql);  

	}

	public List<WeightLog> findAll() {
		return jdbcTemplate.query("select * from weightlog",new RowMapper<WeightLog>(){    
			public WeightLog mapRow(ResultSet rs, int row) throws SQLException {  
				WeightLog w=new WeightLog();    
				w.setWeight(rs.getInt(2));
				w.setCreated_At(rs.getObject(3,LocalDate.class));
				w.setUpdated_At(rs.getObject(4,LocalDate.class));
				w.setUserId(rs.getString(5));

				return w; 
			}});


	}

	public void update(WeightLog weightLog) {

		String sqlQuery = "update weightlog set weight=? where userid = ?";
		jdbcTemplate.update(sqlQuery,weightLog.getWeight(),(String)weightLog.getUserId() );


	}

	public void delete(WeightLog weightlog) {

		// TODO Auto-generated method stub
		String sqlQuery = "delete from weightlog where userid = ?";
		jdbcTemplate.update(sqlQuery, weightlog.getUserId());
	}


}
