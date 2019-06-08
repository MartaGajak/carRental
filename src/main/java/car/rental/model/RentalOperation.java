package car.rental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table (name = "rental_operation")

public class RentalOperation {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;

    @OneToOne (targetEntity = Employee.class)
    private Employee employee;

    private Date FromDay;

    @OneToOne (targetEntity = Reservation.class)
    private Reservation reservation;

    private String additionalInfo;
}
