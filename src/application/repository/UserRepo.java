package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import application.entity.User;

public interface UserRepo extends JpaRepository<User, String>{
	
	@Query("select u.userEmail from User u")
	String[] getAlleMails();
	

}
