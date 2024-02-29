package com.kuu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kuu.beans.UserBO;
import com.kuu.factories.ConnectionFactory;
import com.mysql.cj.xdevapi.Result;

public class UserDAOImpl implements UserDAO {
    
	private static final String INSERT_SQL_QUERY = "INSERT INTO USER(name , email , phone_no , password) values (?,?,?,?)";
	private static final String SELECT_SQL_QUERY = "SELECT * FROM USER WHERE EMAIL= ? AND PASSWORD =?";
	private static final String UPDATE_PROFILE = "UPDATE USER SET NAME = ? , EMAIL = ? , PHONE_NO = ? , PASSWORD = ? WHERE ID = ? ";
	
	@Override
	public boolean userRegister(UserBO user) {
		
		boolean flag = false;
		
		try {
			
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL_QUERY);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPhone_no());
			preparedStatement.setString(4, user.getPassword());
			
			int rowCount = preparedStatement.executeUpdate();
			
			if(rowCount==1) {
				flag = true;
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public UserBO login(String email, String password) {
		
		UserBO bo = null;
		
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SQL_QUERY);
			
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				bo = new UserBO();
				bo.setId(rs.getInt(1));
				bo.setName(rs.getString(2));
				bo.setEmail(rs.getString(3));
				bo.setPhone_no(rs.getString(4));
				bo.setPassword(rs.getString(5));
				bo.setAddress(rs.getString(6));
				bo.setLandmark(rs.getString(7));
				bo.setCity(rs.getString(8));
				bo.setState(rs.getString(9));
				bo.setPincode(rs.getInt(10));
			}
			
			
		}catch (Exception e) {
		e.printStackTrace();
		}
		return bo;
	}

	@Override
	public boolean updateProfile(UserBO user) {
		boolean flag = false ;
		
		try {
			
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps  = conn.prepareStatement(UPDATE_PROFILE);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhone_no());
			ps.setString(4, user.getPassword());
			ps.setInt(5, user.getId());
			
			int rowCount  =  ps.executeUpdate();
			
			if(rowCount==1) {
				flag = true;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
