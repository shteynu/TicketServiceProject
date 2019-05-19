package application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class SeatHallDto {
	
	private Integer rowNumber;
	private Integer seatsInRow;

}
