package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.LegInstance;

import java.util.List;

public interface LegInstanceService {
    DataResult<List<LegInstance>> getAll();
}
