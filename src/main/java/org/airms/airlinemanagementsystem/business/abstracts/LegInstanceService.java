package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.LegInstance;

import java.util.List;

public interface LegInstanceService {
    List<LegInstance> getAll();
}
