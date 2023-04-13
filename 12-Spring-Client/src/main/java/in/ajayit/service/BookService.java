package in.ajayit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ajayit.binding.Book;

@Service
public class BookService {

	public void invokeBookTicket() {

		String apiUrl = "hfhefeh/ekr/rd";

		Book book = new Book();

		book.setBookName("java");
		book.setBookPrice(430.00);

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> postForEntity = rt.postForEntity(apiUrl, book, String.class);
		System.out.println(postForEntity.getBody());
	}

}
