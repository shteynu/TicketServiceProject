package application.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import application.dto.EventDto;
import application.dto.HallDto;
import application.dto.PriceDto;
import application.dto.SeatDto;
import application.dto.SeatHallDto;
import application.dto.SeatTypeDto;
import application.dto.TicketDto;
import application.dto.UserDto;
import application.entity.Event;
import application.entity.Hall;
import application.entity.Price;
import application.entity.Seat;
import application.entity.SeatHall;
import application.entity.SeatType;
import application.entity.Ticket;
import application.entity.User;

@Mapper
public interface TSMapper {
	EventDto toEventDto(Event event);
	List<EventDto> toEventDtos(List<Event> events);
	Event toEvent(EventDto eventDto);
	
	HallDto toHallDto(Hall hall);
	List<HallDto> toHallDtos(List<Hall> halls);
	Hall toHall(HallDto eventDto);
	
	PriceDto toPriceDto(Price price);
	List<PriceDto> toPriceDtos(List<Price> prices);
	Price toPrice(PriceDto priceDto);
	
	SeatDto toSeatDto(Seat seat);
	List<SeatDto> toSeatDtos(List<Seat> seats);
	Seat toSeat(SeatDto seatDto);
	
	SeatHallDto toSeatHallDto(SeatHall seatHall);
	List<SeatHallDto> toSeatHallDtos(List<SeatHall> seatHalls);
	SeatHall toSeatHall(SeatHallDto seatHallDto);
	
	SeatTypeDto toSeatTypeDto(SeatType seatType);
	List<SeatTypeDto> toSeatTypeDtos(List<SeatType> seatTypes);
	SeatType toSeatType(SeatTypeDto seatTypeDto);
	
	TicketDto toTicketDto(Ticket ticket);
	List<TicketDto> toTicketDtos(List<Ticket> tickets);
	Ticket toTicket(TicketDto ticketDto);
	
	UserDto toUserDto(User user);
	List<UserDto> toUserDtos(List<User> users);
	User toUser(UserDto userDto);
	
	
}
