package car.rental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "rental_office")
public class RentalOffice {
    private String name;
    private String URL;
    private String contactAdress;
    private String owner;
    private String pictureURL; // to do ograniecia
    private List<Branch> branchList;
}
