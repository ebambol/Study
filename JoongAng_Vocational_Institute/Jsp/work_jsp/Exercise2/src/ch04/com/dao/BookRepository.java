package ch04.com.dao;
import java.util.ArrayList;


import ch04.com.dto.Book;

public class BookRepository {
	ArrayList<Book> listOfBooks = new ArrayList<Book>();
	
	public BookRepository() {
		Book book1 = new Book("Num1", "HTML5+CSS3", 15000); 
		book1.setDescription("워드나 PPT 문서를 만들 수 있나요?");
		book1.setCategory("Hello Coding");
		book1.setPublisher("한빛미디어");
		book1.setAuthor("황재호");

		Book book2 = new Book("Num2", "쉽게 배우는 자바 프로그래밍", 27000); 
		book2.setDescription("객체 지향의 핵심과 자바의 현대적 기능을 충실히...");
		book2.setCategory("IT 모바일");
		book2.setPublisher("한빛아카데미");
		book2.setAuthor("황재호");

		Book book3 = new Book("Num3", "스프링4 입문", 27000); 
		book3.setDescription("스프링은 단순히 사용 방법만 익히는 것보다 아키텍처를 어떻게 ...");
		book3.setCategory("IT 모바일");
		book3.setPublisher("한빛미디어");
		book3.setAuthor("하세가와 유이치, 오오노 와타루, 토키 코헤이(권은철, 전민수)");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		
	}
	public ArrayList<Book> getAllProducts() {
		return listOfBooks;
	}
}
