package com.kuu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.kuu.beans.BookDetails;
import com.kuu.beans.Cart;
import com.kuu.beans.UserBO;
import com.kuu.dao.BookDAOImpl;
import com.kuu.dao.CartDAOImpl;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			int bid = Integer.parseInt(request.getParameter("bid"));
			int uid = Integer.parseInt(request.getParameter("uid"));
			
			BookDAOImpl dao = new BookDAOImpl();
			BookDetails  book = dao.getBookById(bid);
			
			Cart c = new Cart();
			c.setBid(bid);
			c.setUserId(uid);
			c.setBookName(book.getBookname());
			c.setAuthor(book.getAuthor());
			c.setPrice(book.getPrice());
			c.setTotalPrice(book.getPrice());
			
			CartDAOImpl dao2 =  new CartDAOImpl();
			boolean f =dao2.addCart(c);
			
			HttpSession session = request.getSession();
			if(f) {
				session.setAttribute("addcart","Book Added To Cart" );
				response.sendRedirect("all_new_book.jsp");;

			}else {
				session.setAttribute("failed","Something Wrong On Server" );
				response.sendRedirect("all_new_book.jsp");
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
