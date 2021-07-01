package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.Ffc;

import java.util.List;
import java.util.Optional;

public interface FfcService {
    DataResult<List<Ffc>> getAll();
    DataResult<Ffc> getById(String ffcId);
    DataResult<Optional<List<Ffc>>> getByCategoryName(String category);
    Result add(Ffc ffc);
    Result update(String ffcId, Ffc ffc);
    Result deleteById(String FfcId);
}
