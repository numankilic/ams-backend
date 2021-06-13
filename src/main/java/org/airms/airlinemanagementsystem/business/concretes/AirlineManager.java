package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirlineService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
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
}
