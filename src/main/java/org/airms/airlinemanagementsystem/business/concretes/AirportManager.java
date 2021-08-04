package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirportService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessResult;
import org.airms.airlinemanagementsystem.dataAccess.AirportDao;
import org.airms.airlinemanagementsystem.entities.concretes.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public DataResult<Optional<Airport>> getById(String id) {
        return new SuccessDataResult<>(this.airportDao.findById(id));
    }

    @Override
    public Result add(Airport airport) {
        this.airportDao.save(airport);
        return new SuccessResult("Airport Saved");
    }

    @Override
    public Result deleteById(String id) {
        this.airportDao.deleteById(id);
        return new SuccessResult("Airport Deleted");
    }

    @Override
    public DataResult<Airport> update(String id, Airport airport) {
        Airport a = this.airportDao.getById(id);
        a.setCity(airport.getCity());
        a.setName(airport.getName());
        a.setState(airport.getState());
        return new SuccessDataResult<>(this.airportDao.save(a), "Airport updated");
    }
}
