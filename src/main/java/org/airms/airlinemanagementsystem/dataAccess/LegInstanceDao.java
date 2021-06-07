package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.LegInstance;
import org.airms.airlinemanagementsystem.entities.compositeKey.LegInstanceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegInstanceDao extends JpaRepository<LegInstance, LegInstanceId> {
}
