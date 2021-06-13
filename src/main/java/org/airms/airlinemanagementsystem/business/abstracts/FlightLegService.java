package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.FlightLeg;

import java.util.List;

public interface FlightLegService {
    DataResult<List<FlightLeg>> getAll();

}
