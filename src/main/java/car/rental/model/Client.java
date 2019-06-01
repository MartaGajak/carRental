package car.rental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "client")

public class Client {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private String name;
    private String surname;
    private String email;
    private String adress;

   //wiele rezerwacji może być dokonane przez tego samego klienta
}
