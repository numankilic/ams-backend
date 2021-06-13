package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;

import java.util.List;

public interface AirplaneTypeService {
    DataResult<List<AirplaneType>> getAll();
}
