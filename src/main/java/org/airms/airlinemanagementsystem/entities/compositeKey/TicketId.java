package org.airms.airlinemanagementsystem.entities.compositeKey;

import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;
@EqualsAndHashCode
public class TicketId implements Serializable {
    private String passportNumber;
    private String flightNumber;
    private String fareCode;
    private LocalDate date;

    public TicketId() {
    }

    public TicketId(String passportNumber, String flightNumber, String fareCode, LocalDate date) {
        this.passportNumber = passportNumber;
        this.flightNumber = flightNumber;
        this.fareCode = fareCode;
        this.date = date;
    }
}
