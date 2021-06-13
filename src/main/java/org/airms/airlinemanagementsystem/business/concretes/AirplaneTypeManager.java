package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirplaneTypeService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.dataAccess.AirplaneTypeDao;
import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
