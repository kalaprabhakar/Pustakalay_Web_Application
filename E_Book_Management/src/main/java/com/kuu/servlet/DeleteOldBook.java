package com.kuu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.kuu.dao.BookDAOImpl;

@WebServlet("/deleteoldbook")
public class DeleteOldBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email =  request.getParameter("email");
		int bookid =  Integer.parseInt(request.getParameter("bookid"));
		
		try {
			
			BookDAOImpl dao = new BookDAOImpl();
			
			boolean flag = dao.oldBookDelete(email,bookid );
			

			HttpSession session = request.getSession();
			 if(flag) {
				 session.setAttribute("succMsg", "Book Removed From Cart");
				 response.sendRedirect("old_book.jsp");
			 }else {
				 session.setAttribute("failedMsg", "Something Wrong On Server");
				 response.sendRedirect("old_book.jsp");
				 
			 }
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
