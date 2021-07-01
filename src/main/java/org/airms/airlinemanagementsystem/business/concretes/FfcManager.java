package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.FfcService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.dataAccess.FfcDao;
import org.airms.airlinemanagementsystem.entities.concretes.Ffc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FfcManager implements FfcService {
    FfcDao ffcDao;

    @Autowired
    public FfcManager(FfcDao ffcDao) {
        this.ffcDao = ffcDao;
    }

    @Override
    public DataResult<List<Ffc>> getAll() {
        return new SuccessDataResult<>(this.ffcDao.findAll(), "FFC listed");
    }

    @Override
    public DataResult<Ffc> getById(String ffcId) {
        return new SuccessDataResult<>(this.ffcDao.getById(ffcId));
    }

    @Override
    public DataResult<Optional<List<Ffc>>> getByCategoryName(String category) {
        return new SuccessDataResult<>(this.ffcDao.getByCategory(category), "Category Listed");
    }

    @Override
    public Result add(Ffc ffc) {
        return null;
    }

    @Override
    public Result update(String ffcId, Ffc ffc) {
        return null;
    }

    @Override
    public Result deleteById(String FfcId) {
        return null;
    }
}
