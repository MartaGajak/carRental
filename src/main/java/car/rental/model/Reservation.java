package car.rental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //here is autoincrement

    @Column (name = "id_reservation")
    private long idReservation;
    @Column(name = "reservationDate")
    private Date reservationDate;
    @Column (name = "client")
    private Client client;
    @Column (name = "car")
    private Car car;
    @Column (name = "from_day")
    private Date FromDay;
    @Column (name = "to_day")
    private Date ToDay;
    @Column (name = "branch_where_car_rented")
    private Branch branchWhereCarRented;
    @Column (name = "branch_where_car_returned")
    private Branch branchWhereCarReturned;
    @Column (name = "price")
    private double price;
}
