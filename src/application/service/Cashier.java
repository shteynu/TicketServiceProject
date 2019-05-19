
package application.service;

import application.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class Cashier extends User implements I_Cashier {

    @Override
    public String[] getActiveEvents () {
        return new String[0];
    }

    @Override
    public String[] getActiveEventsByCat (int idCat) {
        return new String[0];
    }

    @Override
    public String[] getActiveEventsByHall (int idHall) {
        return new String[0];
    }

    @Override
    public String[] getActiveEventsByDate (LocalDate date) {
        return new String[0];
    }

    @Override
    public String getEventById (int id) {
        return null;
    }

    @Override
    public String getTicketById (int idTicket) {
        return null;
    }

    @Override
    public String getTicketByNumber (int ticketNumber) {
        return null;
    }

    @Override
    public boolean changeTicketState (int state) {
        return false;
    }

    @Override
    public void printTicket (int userId) {

    }

}
