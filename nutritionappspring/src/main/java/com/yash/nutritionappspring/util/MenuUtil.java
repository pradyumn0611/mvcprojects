package com.yash.nutritionappspring.util;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.mysql.jdbc.SocketMetadata.Helper;
import com.yash.nutritionappspring.helper.WeightLogCases;
import com.yash.nutritionappspring.main.App;

/*
 * This the Menu section of your weightlog module.
 * Depending on user choice Save , Display , Delete ,Update functionalities are provided.
 * Provided Utility of Menu of WeightLog Module.
 */
public class MenuUtil {
	@Autowired
	WeightLogCases cases;
	
		public MenuUtil(App app) {
		// TODO Auto-generated constructor stub
	}

		public MenuUtil() {
			// TODO Auto-generated constructor stub
		}

	

		/**
		 * Start Method : This Method will get  User to the Menu for your console based application.
		 */
		public void start() 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\nEnter Choice :\n 1.SAVE 2.DISPLAY 3.UPDATE 4.delete 5.EXIT");
			int choice= sc.nextInt();
			/**
			 * switch will give user to take any of the given values.
			 * And which let user do the many different things. 
			 */
			switch(choice)
			{ 
			case 1:
			cases.case1();
				break;
				
			case 2:
			cases.case2();
				break;
			
			case 3:
			cases.case3();
				break;
				
			case 4:
			cases.case4();
				break;
			case 5:
				System.out.println(" Thank You For Using WeightLog");
				System.exit(0);
			
			}
			System.out.println("1. continue  2.exit");
			int num=sc.nextInt();
			if( num==1)
			{
				start();
			}
			else
			{
				System.exit(0);
			}
		}

}
