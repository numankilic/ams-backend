package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.concretes.AirplaneType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AirplaneTypeDao extends JpaRepository<AirplaneType, String> {
    @Query("from AirplaneType  where company=:companyId")
    Optional<List<AirplaneType>> getByCompanyId(String companyId);

    @Query("from AirplaneType  where maxSeats>=:seatCount")
    Optional<List<AirplaneType>> getByMaxSeats(int seatCount);
}
