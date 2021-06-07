package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.compositeKey.SeatReservationId;
import org.airms.airlinemanagementsystem.entities.concretes.SeatReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatReservationDao extends JpaRepository<SeatReservation, SeatReservationId> {
}
