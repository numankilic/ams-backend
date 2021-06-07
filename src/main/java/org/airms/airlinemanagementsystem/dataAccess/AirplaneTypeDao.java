package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneTypeDao extends JpaRepository<AirplaneType, String> {
}
