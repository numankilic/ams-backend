package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Airplane;

import java.util.List;

public interface AirplaneService {
    DataResult<List<Airplane>> getAll();
}
