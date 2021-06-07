package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.compositeKey.CheckinId;
import org.airms.airlinemanagementsystem.entities.concretes.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckinDao extends JpaRepository<Checkin, CheckinId> {
}
