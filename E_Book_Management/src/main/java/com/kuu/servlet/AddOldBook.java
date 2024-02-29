package com.kuu.servlet;

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
@WebServlet("/addoldbook")
@MultipartConfig
public class AddOldBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			String bookName = request.getParameter("bname");
			String author = request.getParameter("author");
			double price = Double.parseDouble(request.getParameter("price"));
			String categories = "Old";
			String status = "Active";
			Part part = request.getPart("bimg");
			String fileName = part.getSubmittedFileName();
            String email= request.getParameter("email");
			BookDetails book = new BookDetails();
			book.setAuthor(author);
			book.setBookCategory(categories);
			book.setBookname(bookName);
			book.setEmial(email);
			book.setPhotoName(fileName);
			book.setPrice(price);
			book.setStatus(status);

			BookDAOImpl dao = new BookDAOImpl();
			boolean flag = dao.addBook(book);

			HttpSession session = request.getSession();

			if (flag == true) {

				String path = getServletContext().getRealPath("") + "books";

				File file = new File(path);
				part.write(path + File.separator + fileName);

				session.setAttribute("succMsg", "Book Added Successfully");
				response.sendRedirect("sell_book.jsp");
			} else {
				session.setAttribute("failedMsg", "Something Wrong On Server");
				response.sendRedirect("sell_book.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
