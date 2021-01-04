package com.yash.customerproduct.model;

public class Product {
	
	int id;
	
	int userid;
	String name;
	
	public static int value;
	
	public static int getValue() {
		return value;
	}

	public static void setValue(int value) {
		Product.value = value;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(int id, int userid, String name) {
		super();
		this.id = id;
		this.userid = userid;
		this.name = name;
	}
	
	

}
