package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Flight;

import java.util.List;

public interface FlightService {

    DataResult<List<Flight>> getAll();
}
