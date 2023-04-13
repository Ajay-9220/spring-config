package in.ajayit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ajayit.entity.User;

public interface UserRepository  extends CrudRepository<User, Integer>{
	
	@Query(value = "From User where userName=:cname")
	public List<User> getAllUsersByUserName(String cname);

	


}
