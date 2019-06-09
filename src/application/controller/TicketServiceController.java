package application.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import application.dto.UserDto;
import application.entity.User;
import application.entity.UserRole;
import application.mapper.TSMapper;
import application.service.I_User;

@CrossOrigin(origins = "*")
@RestController
public class TicketServiceController {

	
	
	@Autowired
	I_User userService;
	
	
	private  TSMapper mapper;
	
	
	@GetMapping(value= "/getUserRoles")
	public UserRole[] getUserRoles(){
		//System.out.println(UserRole.values());
		return UserRole.values();
	}
	
	@GetMapping(value = "/getUsers")
	public ResponseEntity<List<User>> getUsers() {
		//userService.getAll().forEach(u -> System.out.println(u));
		//mapper.toUserDtos(userService.getAll()).forEach(System.out::println);
		return  ResponseEntity.ok(userService.getAll());//ResponseEntity.ok(mapper.toUserDtos(userService.getAll()));
		
	}
	
	
	@GetMapping(value ="/getEmails")
	public String[] getEmails() {
		return userService.getEmails();
	}
	
	

}
