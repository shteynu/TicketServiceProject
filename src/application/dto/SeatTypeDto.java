package application.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class SeatTypeDto {
	
	private String seatType;
		
	private List<PriceDto> prices = new ArrayList<>();
}
