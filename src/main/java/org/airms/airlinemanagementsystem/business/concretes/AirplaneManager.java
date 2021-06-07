package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.AirplaneService;
import org.airms.airlinemanagementsystem.dataAccess.AirplaneDao;
import org.airms.airlinemanagementsystem.entities.concretes.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AirplaneManager implements AirplaneService {
    AirplaneDao airplaneDao;

    @Autowired
    public AirplaneManager(AirplaneDao airplaneDao) {
        this.airplaneDao = airplaneDao;
    }

    @Override
    public List<Airplane> getAll() {
        return airplaneDao.findAll();
    }
}
