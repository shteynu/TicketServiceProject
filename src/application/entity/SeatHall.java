package application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "seatHall")

public class SeatHall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seatHallId;
	
	@ManyToOne
	@JsonBackReference
	private Hall hall;
	
	private Integer rowNumber;
	private Integer seatsInRow;

}
