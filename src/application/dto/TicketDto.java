package application.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class TicketDto {
	
	
	private EventDto event;
		
	private AgeTypeDto ageTypeDto;
	
	private UserDto userDto;
	
	private SeatDto seatDto;

}
