package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirlineService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessResult;
import org.airms.airlinemanagementsystem.dataAccess.AirlineDao;
import org.airms.airlinemanagementsystem.entities.concretes.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirlineManager implements AirlineService {

    AirlineDao airlineDao;

    @Autowired
    public AirlineManager(AirlineDao airlineDao) {
        this.airlineDao = airlineDao;
    }

    @Override
    public DataResult<List<Airline>> getAll() {
        return new SuccessDataResult<>(
                this.airlineDao.findAll(), "Airlines Listed"
        );
    }

    @Override
    public DataResult<Optional<Airline>> getById(String id) {
        return new SuccessDataResult<>(this.airlineDao.findById(id), "Airline {id} returned");
    }

    @Override
    public DataResult<Optional<List<Airline>>> getByCompanyId(String companyId) {
        return new SuccessDataResult<>(this.airlineDao.getByCompanyId(companyId), "Airline(s) returned");
    }

    @Override
    public Result add(Airline airline) {
        this.airlineDao.save(airline);
        return new SuccessResult("Airline Saved");
    }

    @Override
    public Result deleteByAirlineId(String airlineId) {
        this.airlineDao.delete(this.airlineDao.getById(airlineId));
        return new SuccessResult("Airline Deleted");
    }

    @Override
    public DataResult<Airline> update(String id, Airline airline) {
        Airline a = this.airlineDao.getById(id);
        a.setAirlineName(airline.getAirlineName());
        a.setCompanyId(airline.getCompanyId());
        return new SuccessDataResult<>(this.airlineDao.save(a), "Airline Updated");
    }
}
