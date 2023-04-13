package in.ajayit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.Query;

import in.ajayit.entity.User;
import in.ajayit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);

		User u1 = new User(101, "sai", "ongole", "xyz@gmail.com");
		User u2 = new User(102, "ravi", "hyderbad", "123@gmail.com");
		User u3 = new User(103, "dass", "vizag", "pqr@gmail.com");
		User u4 = new User(104, "ajay", "guntur", "abc@gmail.com");

		// repository.saveAll(Arrays.asList(u1,u2,u3,u4));

		/*Optional<User> findById = repository.findById(103);
		if (findById.isPresent()) {
			System.out.println(findById.get());
*/
		/*
		 * Iterable<User> allById = repository.findAllById(Arrays.asList(101,102,103));
		 * allById.forEach(user -> { System.out.println(user); });
		 */
			/*
			 * Iterable<User> findAll = repository.findAll(); findAll.forEach(user -> {
			 * System.out.println(user); });
			 */
		/*long count = repository.count();
		System.out.println("Total Records in table :: "+ count);
		}*/
		
		/*boolean existsById = repository.existsById(101);
		System.out.println("Record Presence with id - 101 :: " + existsById);
		*/
		
		//@Query(value = "From User where userName=:cname")
	//	public List<User> getAllUsersByUserName(String cname);
		
		List<User> users  = repository.getAllUsersByUserName("dass");

		users.forEach(user -> {
			System.out.println(user);
	
	}}
	
	

