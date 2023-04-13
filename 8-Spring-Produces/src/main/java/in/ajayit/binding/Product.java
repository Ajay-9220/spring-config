package in.ajayit.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	
	private  Integer pId;
	
	private String pname;
	
	private double pPrice;

}
