package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.LegInstanceService;
import org.airms.airlinemanagementsystem.dataAccess.LegInstanceDao;
import org.airms.airlinemanagementsystem.entities.concretes.LegInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegInstanceManager implements LegInstanceService {

    LegInstanceDao legInstanceDao;

    @Autowired
    public LegInstanceManager(LegInstanceDao legInstanceDao) {
        this.legInstanceDao = legInstanceDao;
    }

    @Override
    public List<LegInstance> getAll() {
        return legInstanceDao.findAll();
    }
}
