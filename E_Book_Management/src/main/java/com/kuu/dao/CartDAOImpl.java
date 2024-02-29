package com.kuu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kuu.beans.BookDetails;
import com.kuu.beans.Cart;
import com.kuu.factories.ConnectionFactory;



public class CartDAOImpl implements ICartDAO {
	
	private static final String SQL_INSERT_QUERY = "INSERT INTO CART(BID, UID, BOOKNAME, AUTHOR , PRICE ,TOTAL_PRICE) VALUES (?,?,?,?,?,?)";
    private static final String GET_BOOKS = "SELECT * FROM CART WHERE UID=?";
	private static final String DELET_BOOKS="DELETE FROM CART WHERE BID= ? AND UID=? AND CID=?";
    private static final String REMOVE_BOOK_FROM_CART = "DELETE FROM CART WHERE UID = ? ";
	
    @Override
	public boolean addCart(Cart c) {
		boolean flag = false;
		try {
			
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL_INSERT_QUERY);
			ps.setInt(1, c.getBid());
			ps.setInt(2, c.getUserId());
			ps.setString(3,c.getBookName());
			ps.setString(4, c.getAuthor());
			ps.setDouble(5, c.getPrice());
			ps.setDouble(6, c.getTotalPrice());
			
			int rowCount =  ps.executeUpdate();
			
			if(rowCount == 1) {
				flag = true;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<Cart> getBookByUser(int id) {
		List<Cart> list = new ArrayList<Cart>();
		
		try {
			
		  Connection conn = ConnectionFactory.getConnection();
		  PreparedStatement ps = conn.prepareStatement(GET_BOOKS);
		  
		  ps.setInt(1, id);
		  
		  ResultSet rs = ps.executeQuery();
		  Cart cart = null;
		  while(rs.next()) {
			  
			  cart = new Cart();
			  cart.setCid(rs.getInt(1));
			  cart.setBid(rs.getInt(2));
			  cart.setUserId(rs.getInt(3));
			  cart.setBookName(rs.getString(4));
			  cart.setAuthor(rs.getString(5));
			  cart.setPrice(rs.getDouble(6));
			  cart.setTotalPrice(rs.getDouble(7));
			  
			  list.add(cart);
		  }
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return  list;
	}

	@Override
	public boolean deleteBook(int bid, int uid , int cid) {
		
		boolean flag=false;
		try {
			
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps = conn.prepareStatement(DELET_BOOKS);
			ps.setInt(1, bid);
			ps.setInt(2, uid);
			ps.setInt(3,cid);
			
			int rowCount = ps.executeUpdate();
			if(rowCount==1) {
				flag=true;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void removeFromCart(int uid) {
		
		try {
			
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps = conn.prepareStatement(REMOVE_BOOK_FROM_CART);
			
			ps.setInt(1, uid);
			int rowCount  = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
