package com.yash.nutritionappspring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.yash.nutritionappspring.util.MenuUtil;

/**
 * Its the Gateway for your NutritionApp's WeightLog Module.
 * Running of Weighlog Will Begin from here.
 * @author pradyumn
 *
 */
@Component
public class App 
{	

/**
	 * 
	 * Weighlog module's execution method is defined here.
	 */
    public static void main( String[] args ) 
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(com.yash.nutritionappspring.configuration.Config.class); 
    	MenuUtil menuUtil=(MenuUtil)context.getBean("menuUtil");
    	
    	System.out.println("\n{ NUTRITION APP :  WEIGHTLOG }\n");
        
        menuUtil.start();
    }

}
