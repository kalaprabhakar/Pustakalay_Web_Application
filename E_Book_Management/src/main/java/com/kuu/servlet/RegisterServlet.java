package com.kuu.servlet;

import java.io.IOException;

import com.kuu.beans.UserBO;
import com.kuu.dao.UserDAOImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/regi")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String password = request.getParameter("password");
			String check = request.getParameter("check");
			
			UserBO user = new UserBO();
			user.setName(name);
			user.setEmail(email);
			user.setPhone_no(phone);
			user.setPassword(password);
			HttpSession session = request.getSession();
			if(check != null) {
			UserDAOImpl dao = new UserDAOImpl();
			boolean flag = dao.userRegister(user);
			
			
			
			if(flag==true) {
				session.setAttribute("succMsg", "Registration Success....");
				response.sendRedirect("register.jsp");
			}else {
				session.setAttribute("failedMsg", "Something Wrong On Server....");
				response.sendRedirect("register.jsp");
			}
			}else {
				session.setAttribute("failedMsg", "Please Check Terms & Conditions....");
				response.sendRedirect("register.jsp");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
