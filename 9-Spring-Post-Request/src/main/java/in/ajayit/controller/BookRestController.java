package in.ajayit.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.UnknownHttpStatusCodeException;

import in.ajayit.binding.Book;

@RestController
public class BookRestController {

	 @PostMapping (value = "/book", consumes = {"application/json"})

	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		System.out.println(book);
		// DB log....

		String msg = "add books succesful...";

		return new ResponseEntity<Book>(msg, HttpStatusCode.OK);

	}

}
