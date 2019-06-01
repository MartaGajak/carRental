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

    private Employee employee;
    private Date ToDay;
    private Reservation reservation;
    private double extraPayment;
    private String additionalInfo;
}
