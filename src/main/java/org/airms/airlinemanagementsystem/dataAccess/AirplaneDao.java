package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneDao extends JpaRepository<Airplane, String> {
}
