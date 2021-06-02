package jaemukyang.spring.service;

import java.util.List;

import jaemukyang.spring.vo.Book;

public interface BookService {

	void newBook();
	List<Book> readBook();
	Book readOneBook();
	void modifBook(Book b);
	void removeBook(String bookid);

}
