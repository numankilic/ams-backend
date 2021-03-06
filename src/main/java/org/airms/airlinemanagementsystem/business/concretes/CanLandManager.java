package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.CanLandService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.dataAccess.CanLandDao;
import org.airms.airlinemanagementsystem.entities.concretes.CanLand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanLandManager implements CanLandService {
    CanLandDao canLandDao;

    @Autowired
    public CanLandManager(CanLandDao canLandDao) {
        this.canLandDao = canLandDao;
    }

    @Override
    public DataResult<List<CanLand>> getAll() {
        return new SuccessDataResult<>(this.canLandDao.findAll(), "CanLand Table Listed");
    }
}
