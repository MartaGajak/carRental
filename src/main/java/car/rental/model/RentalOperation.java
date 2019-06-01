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

    private Employee employee;
    private Date FromDay;
    private Reservation reservation;
    private String additionalInfo;
}
