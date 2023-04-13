package in.ajayit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ajayit.entity.Book;
import in.ajayit.repo.BookRepository;
import in.ajayit.repo.BookRepository.BookService;

@Service
public class BookServiceIMp implements BookService	 {

	private BookRepository repository;
	

	public BookServiceIMp(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public String upsertBook(Book book) {
	Integer	bookId= book.getBookId();
	System.out.println(book);
	
	repository.save(book);
	System.out.println(book);
	
	if(bookId ==null)
		return "Record Inserted";
	else {
		return "Record Updated";
	}
	
	
	}

	@Override
	public List<Book> getAllBooks() {
	
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		
		 repository.deleteById(bookId);
		 return "Record deleted";
	}

}
