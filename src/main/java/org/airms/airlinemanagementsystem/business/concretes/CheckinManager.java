package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.CheckinService;
import org.airms.airlinemanagementsystem.dataAccess.CheckinDao;
import org.airms.airlinemanagementsystem.entities.concretes.Checkin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckinManager implements CheckinService {
    CheckinDao checkinDao;

    @Autowired
    public CheckinManager(CheckinDao checkinDao) {
        this.checkinDao = checkinDao;
    }

    @Override
    public List<Checkin> getAll() {
        return checkinDao.findAll();
    }
}
