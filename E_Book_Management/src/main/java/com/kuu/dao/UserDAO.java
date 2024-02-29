package com.kuu.dao;

import com.kuu.beans.UserBO;

public interface UserDAO {
	
	boolean userRegister(UserBO user);
	
	public UserBO login(String email ,  String password);
	
	public boolean updateProfile(UserBO user);

}
