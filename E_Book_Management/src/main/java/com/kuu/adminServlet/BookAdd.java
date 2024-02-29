package com.kuu.adminServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

import com.kuu.beans.BookDetails;
import com.kuu.dao.BookDAOImpl;
@WebServlet("/add_books")
@MultipartConfig
public class BookAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String bookName= request.getParameter("bname");
			String author = request.getParameter("author");
			double price = Double.parseDouble(request.getParameter("price"));
			String categories = request.getParameter("btype");
			String status = request.getParameter("bstatus");
			Part part = request.getPart("bimg");
			String fileName= part.getSubmittedFileName();
			
			BookDetails book = new BookDetails();
			book.setAuthor(author);
			book.setBookCategory(categories);
			book.setBookname(bookName);
			book.setEmial("admin");
			book.setPhotoName(fileName);
			book.setPrice(price);
			book.setStatus(status);
			
			BookDAOImpl dao = new BookDAOImpl();
			boolean flag = dao.addBook(book);
			
			HttpSession session = request.getSession();
			
			if(flag==true) {
				
				String path = getServletContext().getRealPath("")+ "books";
				
				File file = new File(path);
				part.write( path + File.separator + fileName);
				
				
				session.setAttribute("succMsg", "Book Added Successfully");
				response.sendRedirect("admin/add_book.jsp");
			}else {
				session.setAttribute("failedMsg", "Something Wrong On Server");
				response.sendRedirect("admin/add_book.jsp");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
