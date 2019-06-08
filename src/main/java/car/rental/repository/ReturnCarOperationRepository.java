package car.rental.repository;

import car.rental.model.ReturnCarOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReturnCarOperationRepository extends JpaRepository <ReturnCarOperation, Long> {

}
