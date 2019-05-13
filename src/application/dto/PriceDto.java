package application.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PriceDto {

	/*private List<SeatDto> seats = new ArrayList<>();*/

	private Double pricePrice;

	private SeatTypeDto seatTypeDto;

	private EventDto eventDto;

}
