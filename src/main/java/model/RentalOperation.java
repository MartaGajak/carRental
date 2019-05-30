package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table (name = "rental_operation")

public class RentalOperation {
    private Employee employee;
    private Date FromDay;
    private Reservation reservation;
    private String additionalInfo;
}
