package in.ajayit.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ajayit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {
	
	public interface BookService {
		public String upsertBook(Book book);
		public List<Book> getAllBooks();
		public String deleteBook(Integer bookId);
		
	}
		

}
