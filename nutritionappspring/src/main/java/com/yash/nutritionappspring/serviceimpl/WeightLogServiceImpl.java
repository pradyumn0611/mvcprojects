package com.yash.nutritionappspring.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yash.nutritionappspring.dao.WeightLogDAO;
import com.yash.nutritionappspring.model.WeightLog;
import com.yash.nutritionappspring.service.WeightLogService;
@Component
public class WeightLogServiceImpl implements WeightLogService{
	@Autowired
	WeightLogDAO weightLogDAO;

	public void create(WeightLog weightLog) {
		weightLogDAO.save(weightLog);
		
	}

	public List<WeightLog> display() {
		
		return weightLogDAO.findAll();
	}

	public void update(WeightLog weightLog) {
		weightLogDAO.update(weightLog);
	}

	public void delete(WeightLog weightLog) {
		weightLogDAO.delete(weightLog);
	}

}
