package car.rental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "car")
public class Car {
    // Warning:(12, 1) Access can be package-private cos takie bylo jak komitowalam
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idCar;

    @Enumerated (EnumType.STRING)
    @Column(name = "brand")
    private Brand brand;

    @Enumerated (EnumType.STRING)
    @Column(name = "model")
    private Model model;

    @Enumerated (EnumType.STRING)
    @Column(name = "body_type")
    private BodyType bodyType;

    @Column(name = "production_year")
    private int productionYear;

    @Enumerated (EnumType.STRING)
    @Column(name = "color")
    private Color color;

    @Enumerated(EnumType.STRING) //to juz jest do bazy danych
    @Column(name = "order_status")
    private OrderStatus orderStatus;

    @Column(name = "price_per_day")
    private double pricePerDay;


}