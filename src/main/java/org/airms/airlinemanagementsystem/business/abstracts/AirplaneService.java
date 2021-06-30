package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.Airplane;

import java.util.List;
import java.util.Optional;

public interface AirplaneService {
    DataResult<List<Airplane>> getAll();
    DataResult<Optional<Airplane>> getById(String id);
    DataResult<Optional<List<Airplane>>> getByCompanyId(String companyId);
    DataResult<Optional<List<Airplane>>> getByAirplaneType(String airplaneTypeName);
    Result add(Airplane airplane);
    Result deleteByAirplaneId(String airplaneId);
}
