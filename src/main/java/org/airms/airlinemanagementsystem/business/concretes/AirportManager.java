package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirportService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
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
    public DataResult<List<Airport>> getAll() {
        return new SuccessDataResult<>(this.airportDao.findAll(), "Airports Listed");
    }
}
