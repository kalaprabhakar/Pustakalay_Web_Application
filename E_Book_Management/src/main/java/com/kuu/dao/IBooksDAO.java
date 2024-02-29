package com.kuu.dao;

import java.util.List;

import com.kuu.beans.BookDetails;

public interface IBooksDAO {

	boolean addBook(BookDetails book);

	List<BookDetails> getAllBooks();

	BookDetails getBookById(int id);

	public boolean updateEditBooks(BookDetails book);

	boolean deleteBooks(int id);

	public List<BookDetails> getNewBook();

	public List<BookDetails> getRecentBook();

	public List<BookDetails> getOldBook();
	
	public List<BookDetails> getAllRecentBook();
	
	public List<BookDetails> getAllNewBook();
	
	public List<BookDetails> getAllOldBook();
	
	public List<BookDetails> getBookByOld(String email , String cate);
	
	public boolean oldBookDelete(String email , int bookId);
	
	public List<BookDetails> getBookBySearch(String ch);
	
	
}
