package in.ajayit.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	
	private Integer bookId;
	
	private String bookName;
	
	private double bookPrice;

}
