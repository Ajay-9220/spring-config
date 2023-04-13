package in.ajayit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="user_table")
public class User {
	@Id
	@Column(name ="user_id")
	private Integer userId;
	
	@Column(name ="user_name")
	private String userName;
	
	@Column(name ="user_addrees")
	private String userAddrees;
	
	@Column(name ="user_email")
	private String userEmail;

}
