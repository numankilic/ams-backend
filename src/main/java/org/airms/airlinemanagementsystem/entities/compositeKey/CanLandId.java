package org.airms.airlinemanagementsystem.entities.compositeKey;

import java.io.Serializable;

public class CanLandId implements Serializable {
    private String airplaneTypeName;
    private String airportCode;

    public CanLandId(String airplaneTypeName, String airportCode) {
        this.airplaneTypeName = airplaneTypeName;
        this.airportCode = airportCode;
    }

    public CanLandId() {
    }
}
