package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Airline;
import org.airms.airlinemanagementsystem.entities.concretes.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirlineDao extends JpaRepository<Airline, String> {

}
