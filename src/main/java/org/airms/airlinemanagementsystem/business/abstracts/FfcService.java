package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Ffc;

import java.util.List;

public interface FfcService {
    DataResult<List<Ffc>> getAll();
}
