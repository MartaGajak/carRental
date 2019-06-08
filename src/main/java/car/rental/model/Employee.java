package car.rental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String surname;
    private String jobTitle;

//    @ManyToOne (targetEntity = Branch.class)
//    private Branch branch;

//
//@JoinColumn (name = "")
//    private String branch;
}
