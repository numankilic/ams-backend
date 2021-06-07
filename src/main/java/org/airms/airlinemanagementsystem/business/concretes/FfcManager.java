package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.FfcService;
import org.airms.airlinemanagementsystem.dataAccess.FfcDao;
import org.airms.airlinemanagementsystem.entities.concretes.Ffc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FfcManager implements FfcService {
    FfcDao ffcDao;

    @Autowired
    public FfcManager(FfcDao ffcDao) {
        this.ffcDao = ffcDao;
    }

    @Override
    public List<Ffc> getAll() {
        return ffcDao.findAll();
    }
}
