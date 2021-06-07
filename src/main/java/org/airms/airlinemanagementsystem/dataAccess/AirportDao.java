package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportDao extends JpaRepository<Airport, String> {
}
