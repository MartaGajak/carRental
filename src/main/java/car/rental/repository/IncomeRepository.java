package car.rental.repository;

import car.rental.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository <Reservation, Long>{

    // tu metoda ktora wyciaga sume kwot za wypozyczenia
}
