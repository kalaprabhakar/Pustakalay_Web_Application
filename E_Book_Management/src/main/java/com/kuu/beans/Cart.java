package com.kuu.beans;

import lombok.Data;

@Data
public class Cart {
	
	private Integer cid;
	private Integer bid;
	private Integer userId;
	private String bookName;
	private String author;
	private Double price;
	private Double totalPrice ;
	
}
