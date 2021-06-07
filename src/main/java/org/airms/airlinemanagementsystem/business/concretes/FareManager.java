package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.FareService;
import org.airms.airlinemanagementsystem.dataAccess.FareDao;
import org.airms.airlinemanagementsystem.entities.concretes.Fare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FareManager implements FareService {
    FareDao fareDao;

    @Autowired
    public FareManager(FareDao fareDao) {
        this.fareDao = fareDao;
    }

    @Override
    public List<Fare> getAll() {
        return fareDao.findAll();
    }
}
