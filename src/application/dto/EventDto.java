package application.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class EventDto {
	
	private Long eventId;
	/*private List<TicketDto> tickets = new ArrayList<>();
	private List<PriceDto> prices = new ArrayList<>();*/
	private String eventName;
	private LocalDate eventDate;
	private LocalTime eventTime;
	private HallDto hallDto;
	private EventTypeDto eventTypeDto;
	private String description;
	private String image;
	private StatusDto statusDto;
	
	

}
