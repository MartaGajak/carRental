package car.rental.service;

import car.rental.repository.RentalOfficeRepository;

public class RentalService {

    RentalOfficeRepository rentalOfficeRepository;

    public RentalService(RentalOfficeRepository rentalOfficeRepository) {
        this.rentalOfficeRepository = rentalOfficeRepository;
    }
}
