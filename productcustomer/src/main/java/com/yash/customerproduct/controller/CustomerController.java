package com.yash.customerproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yash.customerproduct.daoimpl.CustomerDAOImpl;
import com.yash.customerproduct.daoimpl.ProductDAOImpl;
import com.yash.customerproduct.model.Customer;
import com.yash.customerproduct.model.Product;


@Controller
public class CustomerController {
	@Autowired
	CustomerDAOImpl customerdaoimpl;
	
	@Autowired
	ProductDAOImpl productDAOImpl;
	
	
	
	
	 @RequestMapping("/customerform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Customer());  
	        return "customerform";   
	    } 
	 @RequestMapping(value="/save1",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("customer") Customer customer){  
		// int id=customer.getId();
	   //Product.value=id;
	   //System.out.println(id);
		 customerdaoimpl.save(customer);    
	        return "redirect:/productform"; 
	    }   
	
	
	 @RequestMapping("/productform")    
	    public String showProductForm(Model m){    
	        m.addAttribute("command", new Product()); 
	        return "productform";   
	    } 
	 @RequestMapping(value="/save2",method = RequestMethod.POST)    
	    public String save2(@ModelAttribute("product") Product product){    
	    	productDAOImpl.save(product);    
	        return "redirect:/view"; 
	    }   
	
	 
	 @RequestMapping("/view")    
	    public void viewProductCustomer(Model m3){    
	       List<Customer> list1=customerdaoimpl.findAll(); 
	       List<Product> list2=productDAOImpl.findAll();    
	       
	       m3.addAttribute("list1",list1);  
	       m3.addAttribute("list2",list2);  
	  
	            
	    }    

}
