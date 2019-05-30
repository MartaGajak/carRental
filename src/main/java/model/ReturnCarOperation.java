package model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import io.micrometer.core.annotation.TimedSet;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table (name = "return_car_operation")
public class ReturnCarOperation {
    private Employee employee;
    private Date ToDay;
    private Reservation reservation;
    private double extraPayment;
    private String additionalInfo;
}
