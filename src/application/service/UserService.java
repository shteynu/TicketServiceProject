package application.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.entity.User;
import application.repository.UserRepo;

@Service
public class UserService extends Guest implements I_User {
	@Autowired
	UserRepo users;

	@Override
	public void checkingPassword(String userEmail, String UserPass) {
		// TODO Auto-generated method stub
	}

	@Override
	public void forgenPassword() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showDates(LocalDate date) {
		// TODO Auto-generated method stub
	}

	@Override
	public void logOut() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsInDateRangeByPriceInAsceptingOrder(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsInDateRangeByPriceInDescendingOrder(LocalDate endDate, LocalDate startDate) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsByPriceRangeInAsceptingOrder(double priceFrom, double priceTo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getHallScheme(String hallName) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<User> getAll() {
		return users.findAll();
	}

	@Override
	public String[] getEmails() {
			
		return users.getAlleMails();
	}

	

}
