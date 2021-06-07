package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.FlightLeg;

import java.util.List;

public interface FlightLegService {
    List<FlightLeg> getAll();

}
