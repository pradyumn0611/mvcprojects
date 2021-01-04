package com.yash.nutritionappspring.helper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yash.nutritionappspring.model.WeightLog;
import com.yash.nutritionappspring.service.WeightLogService;



/**
 * This class works with the inplementation part of the funtionality selected.
 * Processing of data and choices entered by user is done here.
 * @author pradyumn
 *
 */
@Component
public class WeightLogCases {
	/*
	 * stores weight for user.
	 */
	Integer weight;
	/*
	 * To get date from system and autometically updates in data save and update by user.
	 */
	LocalDate date=LocalDate.now();
	/**
	 * stores userid of user
	 */
	String userId;
	Scanner scanner=new Scanner(System.in);
	@Autowired
	WeightLog weightLog;
	@Autowired
	WeightLogService wls;
	
	//@Autowired
	//WeightLogAvailability weightLogAvailability;
	
	
	/**
	 * case1 gives implementation for save.
	 * process the save request by the user.
	 */
	public void case1() 
	{
		
		
		System.out.println("Enter Weight LOG Details to be saved");
		System.out.println("Enter userId : ");
		userId=scanner.next();
		//weightLogAvailability.checkUserIdSave(userId);
		System.out.println("Enter weight : ");
		weight=scanner.nextInt();
		weightLog.setUserId(userId);
		weightLog.setWeight(weight);
		weightLog.setCreated_At(date);
		weightLog.setUpdated_At(date);
		wls.create(weightLog);
	}
	/**
	 * case2 gives implementation for display.
	 * process display save request by the user.
	 */
	public void case2() 
    {
    	List<WeightLog> list=new ArrayList<WeightLog>();
			list=wls.display();
		
		for(WeightLog p:list) {
			System.out.println(p);
		}
}
	/**
	 * case3 gives implementation for update.
	 * process the update request by the user.
	 */
    public void case3() 
    {
    		
	System.out.println("Enter your userid  : ");
	userId=scanner.next();
	//weightLogAvailability.checkUserIdExists(userId);
	System.out.println("Enter weight : ");
	weight=scanner.nextInt();
	weightLog.setUserId(userId);
	weightLog.setWeight(weight);
	weightLog.setCreated_At(date);
	weightLog.setUpdated_At(date);
	wls.update(weightLog);
	
    	}
    /**
	 * case4 gives implementation for delete.
	 * process the delete request by the user.
	 */
    public void case4()
    {
	System.out.println("Enter Product Details to be deleted");
	System.out.println("Enter id userId : ");
	userId=scanner.next();
	//weightLogAvailability.checkUserIdExists(userId);
	System.out.println("\n\nAre you sure to delete your WeightLog \n [y]Delete [Any key] Don't Delete");
	String delData=scanner.next();
	if(delData.equalsIgnoreCase("y"))
	{
		weightLog.setUserId(userId);
		weightLog.setCreated_At(date);
		weightLog.setUpdated_At(date);
		wls.delete(weightLog);
    }
}}
