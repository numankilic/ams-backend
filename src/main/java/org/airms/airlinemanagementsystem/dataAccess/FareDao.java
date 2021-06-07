package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Fare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FareDao extends JpaRepository<Fare, String> {
}
