package application.dto;

import java.util.ArrayList;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserDto {
	
	private String userEmail;
	
	private List<TicketDto> tickets = new ArrayList<>();
	
	private String userPass;
	
	private UserRoleDto userRole;
	private String userPhone;
	private String userName;

}
