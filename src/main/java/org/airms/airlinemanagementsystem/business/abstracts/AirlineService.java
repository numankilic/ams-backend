package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.Airline;

import java.util.List;

public interface AirlineService {
    List<Airline> getAll();
}
