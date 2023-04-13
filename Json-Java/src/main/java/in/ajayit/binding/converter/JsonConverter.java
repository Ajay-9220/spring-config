package in.ajayit.binding.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ajayit.binding.AuthAddress;
import in.ajayit.binding.Book;

public class JsonConverter {
	
	public static void main(String[] args) throws Exception {
		
		AuthAddress  auth = new AuthAddress ();
		auth.setAuthLoc("hyd");
		auth.setAuthVill("kph");
		auth.setDiscount("50%");
		
		
		Book bookObj = new Book();
		bookObj.setBoookId(111);
		bookObj.setBookName("Spring");
		bookObj.setBookPrice(4500);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.json"),bookObj  );
		//mapper.writeValue(new File("book.json"), bookObj);
		System.out.println("Conversion compeleted");
	}

}
