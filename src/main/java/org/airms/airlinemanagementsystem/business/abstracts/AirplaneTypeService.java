package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;

import java.util.List;

public interface AirplaneTypeService {
    List<AirplaneType> getAll();
}
