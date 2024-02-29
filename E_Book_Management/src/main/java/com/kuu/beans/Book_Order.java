package com.kuu.beans;

import lombok.Data;

@Data
public class Book_Order {

	private Integer id;
	private String orderId;
	private String userName;
	private String email;
	private String phone;
	private String fulladdr;
	
	private String bookName;
	private String author ;
	private Double price ;
	private String payment;
	
	

}
