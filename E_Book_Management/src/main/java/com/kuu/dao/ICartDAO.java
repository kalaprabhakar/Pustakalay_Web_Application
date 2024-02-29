package com.kuu.dao;

import java.util.List;

import com.kuu.beans.BookDetails;
import com.kuu.beans.Cart;

public interface ICartDAO {

	boolean addCart(Cart c);

	List<Cart> getBookByUser(int id);
	
	boolean deleteBook(int bid , int uid ,int cid);
	
	void removeFromCart(int uid);

}