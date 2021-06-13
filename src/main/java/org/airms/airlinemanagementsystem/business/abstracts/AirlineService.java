package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Airline;
import org.airms.airlinemanagementsystem.entities.concretes.Flight;

import java.util.List;
import java.util.Optional;

public interface AirlineService {

    DataResult<List<Airline>> getAll();
    DataResult<Optional<Airline>> getById(String id);
}
