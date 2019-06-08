package car.rental.repository;

import car.rental.model.RentalOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalOfficeRepository extends JpaRepository <RentalOffice, Long> {
}
