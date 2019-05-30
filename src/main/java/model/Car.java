package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table (name = "car")
public class Car {
    // Warning:(12, 1) Access can be package-private cos takie bylo jak komitowalam
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_car")
    private long idCar;
    @Column(name = "brand")
    private Brand brand;
    @Column(name = "model")
    private Model model;
    @Column(name = "body_type")
    private BodyType bodyType;
    @Column(name = "production_year")
    private String productionYear;
    @Column(name = "color")
    private Color color;
    //@Enumerated(EnumType.STRING) to juz jest do bazy danych
    @Column(name = "order_status")
    private OrderStatus orderStatus;
    @Column(name = "price_per_day")
    private double pricePerDay;
}