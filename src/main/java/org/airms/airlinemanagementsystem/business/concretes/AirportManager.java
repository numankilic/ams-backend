package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirportService;
import org.airms.airlinemanagementsystem.dataAccess.AirportDao;
import org.airms.airlinemanagementsystem.entities.concretes.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportManager implements AirportService {
    AirportDao airportDao;

    @Autowired
    public AirportManager(AirportDao airportDao) {
        this.airportDao = airportDao;
    }

    @Override
    public List<Airport> getAll() {
        return airportDao.findAll();
    }
}
