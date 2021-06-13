package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.CanLand;

import java.util.List;

public interface CanLandService {
    DataResult<List<CanLand>> getAll();
}
