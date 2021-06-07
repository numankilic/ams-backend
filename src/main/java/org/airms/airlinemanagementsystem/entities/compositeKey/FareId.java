package org.airms.airlinemanagementsystem.entities.compositeKey;

import java.io.Serializable;

public class FareId implements Serializable {
    private String flightNumber;
    private String fareCode;

    public FareId(String flightNumber, String fareCode) {
        this.flightNumber = flightNumber;
        this.fareCode = fareCode;
    }

    public FareId() {
    }
}
