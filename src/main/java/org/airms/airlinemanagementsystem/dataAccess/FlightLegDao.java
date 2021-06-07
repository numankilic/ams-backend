package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.FlightLeg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightLegDao extends JpaRepository<FlightLeg, String> {
}
