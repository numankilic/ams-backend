package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.FlightLegService;
import org.airms.airlinemanagementsystem.dataAccess.FlightLegDao;
import org.airms.airlinemanagementsystem.entities.concretes.FlightLeg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightLegManager implements FlightLegService {

    FlightLegDao flightLegDao;

    @Autowired
    public FlightLegManager(FlightLegDao flightLegDao) {
        this.flightLegDao = flightLegDao;
    }

    @Override
    public List<FlightLeg> getAll() {
        return this.flightLegDao.findAll();
    }
}
