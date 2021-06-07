package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.compositeKey.CanLandId;
import org.airms.airlinemanagementsystem.entities.concretes.CanLand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CanLandDao extends JpaRepository<CanLand, CanLandId> {
}
