package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.FlightService;
import org.airms.airlinemanagementsystem.dataAccess.FlightDao;
import org.airms.airlinemanagementsystem.entities.concretes.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightManager implements FlightService {

    FlightDao flightDao;

    @Autowired
    public FlightManager(FlightDao flightDao) {
        super();
        this.flightDao = flightDao;
    }

    @Override
    public List<Flight> getAll() {
        return this.flightDao.findAll();
    }
}
