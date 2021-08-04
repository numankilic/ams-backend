package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.Airport;

import java.util.List;
import java.util.Optional;

public interface AirportService {
    DataResult<List<Airport>> getAll();
    DataResult<Optional<Airport>> getById(String id);
    Result add(Airport airport);
    Result deleteById(String id);
    DataResult<Airport> update(String id, Airport airport);
}
