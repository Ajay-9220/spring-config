package in.ajayit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ajayit.binding.Book;

@Service
public class BookService {
	
	public void invokeAddBook() {
		Book book= new Book();
			//book.setBookName("social");
		//book.setBookPrice(450.00);
		
		
		 String apiUrl = "";/* WebClient web = WebClient.create(); String rep=
		 * web.post() .uri( apiUrl ) .bodyValue(book) .retrieve()
		 * .bodyToMono(String.class) .block();
		 */
		
	WebClient client = WebClient.create();
	String body = client.get();
	.uri(apiUrl)
	.bodyValue(book)
	.retrive()
	.bodyTOMono(Book[].class)
	.subscribe(BookClient::responseHandler);
	
	System.out.println("********RequestHandler******");
	
	public static void responseHandler(Book[]:books) {
		
		System.out.println();
	}
	
		
	}
	

}
