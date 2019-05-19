package application.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AgeTypeDto_Old {

	private List<TicketDto> tickets = new ArrayList<>();

	private Integer coefficient;

}
