package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.User;

public interface UserRepo extends JpaRepository<User, String>{

}
