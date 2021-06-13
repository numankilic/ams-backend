package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Airport;

import java.util.List;

public interface AirportService {
    DataResult<List<Airport>> getAll();
}
