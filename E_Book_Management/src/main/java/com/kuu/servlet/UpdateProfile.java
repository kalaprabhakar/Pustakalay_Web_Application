package com.kuu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.kuu.beans.UserBO;
import com.kuu.dao.UserDAOImpl;

@WebServlet("/updateprofile")
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name= request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String psw = request.getParameter("psw");
		
		UserBO user = new UserBO();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setPhone_no(phone);
		user.setPassword(psw);
		
		try {
			
			UserDAOImpl dao= new UserDAOImpl();
			boolean flag = dao.updateProfile(user);
			

			HttpSession session = request.getSession();
			session.setAttribute("userobj", user);
			 if(flag) {
				 session.setAttribute("succMsg", "Profile Update Successfull");
				 response.sendRedirect("edit_profile.jsp");
			 }else {
				 session.setAttribute("failedMsg", "Something Wrong On Server");
				 response.sendRedirect("edit_profile.jsp");
				 
			 }
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
