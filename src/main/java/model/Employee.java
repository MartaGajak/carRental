package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table (name = "employee")

public class Employee {

    // Warning:(12, 1) Access can be package-private cos takie bylo jak komitowalam
    private String name;
    private String surname;
    private String jobTitle;
    private String branch;
}
