package org.airms.airlinemanagementsystem.entities.compositeKey;

import java.io.Serializable;
import java.time.LocalDate;

public class SeatReservationId implements Serializable {
    private String flightNumber;
    private String legNumber;
    private LocalDate date;
    private int seatNumber;

    public SeatReservationId(String flightNumber, String legNumber, LocalDate date, int seatNumber) {
        this.flightNumber = flightNumber;
        this.legNumber = legNumber;
        this.date = date;
        this.seatNumber = seatNumber;
    }

    public SeatReservationId() {
    }
}
