package org.airms.airlinemanagementsystem.entities.compositeKey;

import java.io.Serializable;
import java.time.LocalDate;

public class LegInstanceId implements Serializable {
    private String flightNumber;
    private String legNumber;
    private LocalDate date;

    public LegInstanceId(String flightNumber, String legNumber, LocalDate date) {
        this.flightNumber = flightNumber;
        this.legNumber = legNumber;
        this.date = date;
    }

    public LegInstanceId() {
    }
}
