package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirplaneTypeService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessResult;
import org.airms.airlinemanagementsystem.dataAccess.AirplaneTypeDao;
import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneTypeManager implements AirplaneTypeService {
    AirplaneTypeDao airplaneTypeDao;

    @Autowired
    public AirplaneTypeManager(AirplaneTypeDao airplaneTypeDao) {
        this.airplaneTypeDao = airplaneTypeDao;
    }

    @Override
    public DataResult<List<AirplaneType>> getAll() {
        return new SuccessDataResult<>(this.airplaneTypeDao.findAll(), "Airplane Types Listed");
    }

    @Override
    public DataResult<Optional<AirplaneType>> getById(String id) {
        return new SuccessDataResult<>(this.airplaneTypeDao.findById(id), "Airplane type returned");
    }

    @Override
    public DataResult<Optional<List<AirplaneType>>> getByCompanyId(String companyId) {
        return new SuccessDataResult<>(this.airplaneTypeDao.getByCompanyId(companyId), "Airplane types listed");
    }

    @Override
    public DataResult<Optional<List<AirplaneType>>> getByMaxSeats(int seatCount) {
        return new SuccessDataResult<>(this.airplaneTypeDao.getByMaxSeats(seatCount), "Airplane types listed");
    }

    @Override
    public Result add(AirplaneType airplaneType) {
        this.airplaneTypeDao.save(airplaneType);
        return new SuccessResult("Airplane type saved");
    }

    @Override
    public Result deleteByAirplaneId(String airplaneId) {
        this.airplaneTypeDao.deleteById(airplaneId);
        return new SuccessResult("Airplane type deleted");
    }

    @Override
    public Result update(String id, AirplaneType airplaneType) {
        AirplaneType a = this.airplaneTypeDao.getById(id);
        a.setCompany(airplaneType.getCompany());
        a.setMaxSeats(airplaneType.getMaxSeats());
        return new SuccessDataResult<>(this.airplaneTypeDao.save(a), "Airplane type updated");
    }
}
