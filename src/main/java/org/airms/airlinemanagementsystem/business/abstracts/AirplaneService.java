package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.Airplane;

import java.util.List;

public interface AirplaneService {
    List<Airplane> getAll();
}
