package in.ajayit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="Book_DTLS")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Book_ID")
	private Integer bookId;
	
	@Column(name ="Book_Name")
	private String bookName;
	
	@Column(name ="Book_Price")
	private double bookPrice;

}
