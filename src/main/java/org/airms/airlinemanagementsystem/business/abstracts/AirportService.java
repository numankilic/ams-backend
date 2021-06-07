package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.Airport;

import java.util.List;

public interface AirportService {
    List<Airport> getAll();
}
