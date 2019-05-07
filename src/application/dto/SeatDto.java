package application.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class SeatDto {
	
		
	private Integer rowNumber;
	private Integer seatNumber;
	
	
	private PriceDto priceDto;
	
	private HallDto hallDto;
		
	private TicketDto ticketDto;

}
