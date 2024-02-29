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
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			UserDAOImpl dao = new UserDAOImpl();
			HttpSession  session = request.getSession();
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			if("admin@gmail.com".equals(email) && "admin".equals(password)) {
				UserBO bo = new UserBO();
				bo.setName("Admin");		session.setAttribute("userobj", bo);
				response.sendRedirect("admin/home.jsp");
			}else {
				UserBO bo  = dao.login(email, password);
				
				if(bo!=null) {
					session.setAttribute("userobj", bo);
					response.sendRedirect("index.jsp");
				}else {
					session.setAttribute("failedMsg", "Email & Password Invalid");
					response.sendRedirect("login.jsp");
				}
				
				response.sendRedirect("home.jsp");
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
