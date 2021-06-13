package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Checkin;

import java.util.List;

public interface CheckinService {
    DataResult<List<Checkin>> getAll();
}
