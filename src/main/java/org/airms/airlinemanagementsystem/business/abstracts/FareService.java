package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.Fare;

import java.util.List;

public interface FareService {
    List<Fare> getAll();
}
