package org.airms.airlinemanagementsystem.entities.compositeKey;

import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;
@EqualsAndHashCode
public class CheckinId implements Serializable {
    private String passportNumber;
    private String flightNumber;
    private String legNumber;
    private LocalDate date;

    public CheckinId(String passportNumber, String flightNumber, String legNumber, LocalDate date) {
        this.passportNumber = passportNumber;
        this.flightNumber = flightNumber;
        this.legNumber = legNumber;
        this.date = date;
    }

    public CheckinId() {
    }
}
