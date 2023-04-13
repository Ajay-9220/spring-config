package in.ajayit.binding;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class User {
	@NotEmpty(message = "uname is requreted")
	
	@NotEmpty(message = "pwd is requreted")
	private String pwd;
	@NotEmpty(message = "email is requreted")
	private String email;
	
	@NotNull(message = "age is requreted")
	
	private Integer Age;

}
