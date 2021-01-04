package com.yash.nutritionappspring.dao;

import java.util.List;

import com.yash.nutritionappspring.model.WeightLog;

public interface WeightLogDAO {
	
	public void save(WeightLog weightLog);
	
	public List<WeightLog> findAll();
	
	public void update(WeightLog weightLog);
	
	public void delete(WeightLog weightlog);

}
