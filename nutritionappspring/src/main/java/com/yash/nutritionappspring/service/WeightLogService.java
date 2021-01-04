package com.yash.nutritionappspring.service;

import java.util.List;

import com.yash.nutritionappspring.model.WeightLog;

public interface WeightLogService {

	public void create(WeightLog weightLog);
	
	public List<WeightLog> display();
	
	public void update(WeightLog weightLog);
	
	public void delete(WeightLog weightLog);
	
}
