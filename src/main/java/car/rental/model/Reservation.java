package car.rental.model;

import com.google.j2objc.annotations.J2ObjCIncompatible;
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

    @OneToOne (targetEntity = Client.class)
    @JoinColumn (name = "client")
    private Client client;

    @OneToOne (targetEntity = Car.class)
    @JoinColumn (name = "car")
    private Car car;

    @Column (name = "from_day")
    private Date FromDay;
    @Column (name = "to_day")
    private Date ToDay;

    @OneToOne (targetEntity = Branch.class)
    @JoinColumn (name = "branch_where_car_rented")
    private Branch branchWhereCarRented;

    @OneToOne (targetEntity = Branch.class)
    @JoinColumn (name = "branch_where_car_returned")
    private Branch branchWhereCarReturned;

    @Column (name = "price")
    private double price;
}
