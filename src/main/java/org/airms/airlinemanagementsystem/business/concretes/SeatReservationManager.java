package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.SeatReservationService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.SuccessDataResult;
import org.airms.airlinemanagementsystem.dataAccess.SeatReservationDao;
import org.airms.airlinemanagementsystem.entities.concretes.SeatReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatReservationManager implements SeatReservationService {
    SeatReservationDao seatReservationDao;

    @Autowired
    public SeatReservationManager(SeatReservationDao seatReservationDao) {
        this.seatReservationDao = seatReservationDao;
    }

    @Override
    public DataResult<List<SeatReservation>> getAll() {
        return new SuccessDataResult<>(this.seatReservationDao.findAll(), "Seat Reservations Listed");
    }
}
