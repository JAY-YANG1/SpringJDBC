package jaemukyang.spring.dao;

import java.util.List;

import jaemukyang.spring.vo.Book;

public interface BookDAO {

	int insertBook(Book b);
	List<Book> selectBook();
	Book selectOneBook(String bookid);
	int updateBook(Book b);
	int deleteBook(String bookid);
	
}
