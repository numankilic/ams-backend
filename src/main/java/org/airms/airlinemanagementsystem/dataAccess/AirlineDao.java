package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineDao extends JpaRepository<Airline, String> {
}
