package application.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class HallDto {

	private List<EventDto> events = new ArrayList<>();

	private List<SeatDto> seats = new ArrayList<>();

	private String hallName;

	private String hallType;

	private Integer seatsTotal;

	private String layout;

}
