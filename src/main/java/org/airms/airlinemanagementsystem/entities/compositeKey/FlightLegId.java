package org.airms.airlinemanagementsystem.entities.compositeKey;

import lombok.EqualsAndHashCode;

import java.io.Serializable;
@EqualsAndHashCode
public class FlightLegId implements Serializable {
    private String flightNumber;
    private String legNumber;

    public FlightLegId(String flightNumber, String legNumber) {
        this.flightNumber = flightNumber;
        this.legNumber = legNumber;
    }

    public FlightLegId() {
    }
}
