package com.kuu.adminServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.kuu.dao.BookDAOImpl;
@WebServlet("/delete")
public class BooksDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			int id = Integer.parseInt(request.getParameter("id"));
			BookDAOImpl dao = new BookDAOImpl();
			
			boolean flag = dao.deleteBooks(id);
			HttpSession  session =  request.getSession();
			if(flag) {
				
				session.setAttribute("succMsg", "Book Deleted Successfully");
				response.sendRedirect("admin/all_book.jsp");
			}else {

				session.setAttribute("failedMsg", "Something Wrong On Server");
				response.sendRedirect("admin/all_book.jsp");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
