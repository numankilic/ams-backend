package org.airms.airlinemanagementsystem.entities.compositeKey;

import lombok.EqualsAndHashCode;

import java.io.Serializable;
@EqualsAndHashCode
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
