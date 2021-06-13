package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Fare;

import java.util.List;

public interface FareService {
    DataResult<List<Fare>> getAll();
}
