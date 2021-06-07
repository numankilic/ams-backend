package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.Ffc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FfcDao extends JpaRepository<Ffc, String> {
}
