package jaemukyang.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jaemukyang.spring.service.BookService;
import jaemukyang.spring.vo.Book;

public class BookJdbcApp02 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc02.xml");
		
		BookService bksrv = (BookService) ctx.getBean("bksrv02");
		
		//bksrv.newBook();
		//bksrv.readBook();
		//bksrv.readOneBook();
		
		//Book b = new Book("99", "스프링기초", "더나은출판사", "30000");
		//bksrv.modifBook(b);
		
		bksrv.removeBook("100");

	}

}
