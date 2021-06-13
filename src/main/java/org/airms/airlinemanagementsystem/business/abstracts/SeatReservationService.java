package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.SeatReservation;

import java.util.List;

public interface SeatReservationService {
    DataResult<List<SeatReservation>> getAll();
}
