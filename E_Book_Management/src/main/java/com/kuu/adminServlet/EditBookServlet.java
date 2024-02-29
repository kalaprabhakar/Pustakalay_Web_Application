package com.kuu.adminServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;

import com.kuu.beans.BookDetails;
import com.kuu.dao.BookDAOImpl;
import com.kuu.factories.ConnectionFactory;

@WebServlet("/editbooks")
public class EditBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			
            int id = Integer.parseInt(request.getParameter("id"));
			String bookName= request.getParameter("bname");
			String author = request.getParameter("author");
			double price = Double.parseDouble(request.getParameter("price"));
			String status = request.getParameter("bstatus");
			
			BookDetails book = new BookDetails() ; 
			
			
			book.setBookId(id);
			book.setBookname(bookName);
			book.setAuthor(author);
			book.setPrice(price);
			book.setStatus(status);
			
			BookDAOImpl dao = new BookDAOImpl();
			
		boolean flag =	dao.updateEditBooks(book);
		
		HttpSession session = request.getSession();
		
		if(flag) {
			
			session.setAttribute("succMsg", "Book Updated Successfully");
			response.sendRedirect("admin/all_book.jsp");
			
		}else {

			session.setAttribute("failedMsg", "Something Wrong On Server");
			response.sendRedirect("admin/all_book.jsp");
		}
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
