package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;

import java.util.List;
import java.util.Optional;

public interface AirplaneTypeService {
    DataResult<List<AirplaneType>> getAll();
    DataResult<Optional<AirplaneType>> getById(String id);
    DataResult<Optional<List<AirplaneType>>> getByCompanyId(String companyId);
    DataResult<Optional<List<AirplaneType>>> getByMaxSeats(int seatCount);
    Result add(AirplaneType airplaneType);
    Result deleteByAirplaneId(String airplaneId);
    Result update(String id, AirplaneType airplaneType);
}
