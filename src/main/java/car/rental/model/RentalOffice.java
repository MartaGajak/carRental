package car.rental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "rental_office")

public class RentalOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String URL;
    private String contactAdress;
    private String owner;
    private String pictureURL; // to do ograniecia

    @OneToMany(targetEntity = RentalOffice.class)
    private List<Branch> branchList;
}
