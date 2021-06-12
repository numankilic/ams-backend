package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.Airline;
import org.airms.airlinemanagementsystem.entities.concretes.Flight;

import java.util.List;
import java.util.Optional;

public interface AirlineService {
    List<Airline> getAll();
    Optional<Airline> getById(String id);
}
