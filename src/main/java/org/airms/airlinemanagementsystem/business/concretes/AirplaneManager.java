package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirplaneService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessResult;
import org.airms.airlinemanagementsystem.dataAccess.AirplaneDao;
import org.airms.airlinemanagementsystem.entities.concretes.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneManager implements AirplaneService {
    AirplaneDao airplaneDao;

    @Autowired
    public AirplaneManager(AirplaneDao airplaneDao) {
        this.airplaneDao = airplaneDao;
    }

    @Override
    public DataResult<List<Airplane>> getAll() {
        return new SuccessDataResult<>(this.airplaneDao.findAll(), "Airplanes Listed");
    }

    @Override
    public DataResult<Optional<Airplane>> getById(String id) {
        return new SuccessDataResult<>(this.airplaneDao.findById(id));
    }

    @Override
    public DataResult<Optional<List<Airplane>>> getByCompanyId(String companyId) {
        return new SuccessDataResult<>(this.airplaneDao.getByCompanyId(companyId));
    }

    @Override
    public DataResult<Optional<List<Airplane>>> getByAirplaneType(String airplaneTypeName) {
        return new SuccessDataResult<>(this.airplaneDao.getByAirplaneType(airplaneTypeName));
    }

    @Override
    public Result add(Airplane airplane) {
        this.airplaneDao.save(airplane);
        return new SuccessResult("Airplane Saved");
    }

    @Override
    public Result deleteByAirplaneId(String airplaneId) {
        this.airplaneDao.delete(this.airplaneDao.getById(airplaneId));
        return new SuccessResult("Airplane Deleted");
    }
}
