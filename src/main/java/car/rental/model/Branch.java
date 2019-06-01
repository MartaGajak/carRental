package car.rental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "branch")
public class Branch {

    @Id     // The @Id annotation marks a field as a primary key field.
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "address")
    private String address;

    @ OneToMany(mappedBy= "employee_list")
    private List<Employee> employeeList;

    @OneToMany ( targetEntity = Car.class) //mappedBy = "car",
    @Column (name = "available_cars")
    private List<Car> availableCars;
}
