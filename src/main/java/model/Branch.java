package model;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "address")
    private Address address;

    @ OneToMany(mappedBy= "employee_list")
    private List<Employee> employeeList;
    @Column (name = "available_cars")
    private List<Car> availableCars;
}
