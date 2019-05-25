package model;

import java.util.Date;

public class Reservation {

    private Date reservationDate;
    private Client client;
    private Car car;
    private Date FromDay;
    private Date ToDay;
    private Branch branchWhereCarRented;
    private Branch branchWhereCarReturned;
    private double price;
}
