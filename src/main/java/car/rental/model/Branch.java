package car.rental.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapAutoConfiguration;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "branch")
public class Branch {

    @Id     // The @Id annotation marks a field as a primary key field. Potrzebne jesli masz @Entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "address")
    private String address;

    @OneToMany (targetEntity = Employee.class) // lub targetEntity = Employee.class
    private List<Employee> employeeList;

    @OneToMany(targetEntity = Car.class) //lub mappedBy = "car",
    @Column(name = "available_cars")
    private List<Car> availableCars;
}
