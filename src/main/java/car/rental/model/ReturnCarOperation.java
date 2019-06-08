package car.rental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table (name = "return_car_operation")
public class ReturnCarOperation {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //

    private long id;

    @OneToOne (targetEntity = Employee.class)
    @JoinColumn (name = "employee")
    private Employee employee;

    private Date ToDay;

    @OneToOne (targetEntity = Reservation.class)
    @JoinColumn (name = "reservation")
    private Reservation reservation;

    private double extraPayment;
    private String additionalInfo;
}
